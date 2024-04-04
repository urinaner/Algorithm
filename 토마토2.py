from collections import deque
m, n, h = map(int, input().split())
box = []

for _ in range(h):
    arr = []
    for i in range(n):
        arr.append(list(map(int, input().split())))
    box.append(arr)

cnt = 0
for z in range(h):
    for i in range(n):
        for j in range(m):
            if box[z][i][j] == 0:
                cnt+=1
if cnt == 0:
    print(0)
    exit()
dq = deque()
dx = [1, 0, -1, 0, 0, 0]
dy = [0, 1, 0, -1, 0 ,0]
dz = [0, 0, 0, 0, 1, -1]
s = 0
for z in range(h):
    for i in range(n):
        for j in range(m):
            if box[z][i][j] == 1:
                dq.append((z, i, j))
while dq:
    z, x, y = dq.popleft()
    for k in range(6):
        nx = dx[k] + x
        ny = dy[k] + y
        nz = dz[k] + z
        if 0<=nx<n and 0<=ny<m and 0<=nz<h:
            if box[nz][nx][ny] == 0:
                box[nz][nx][ny] = box[z][x][y] + 1
                dq.append((nz, nx, ny))
high = 0
for z in range(h):
    for i in range(n):
        for j in range(m):
            if box[z][i][j] == 0:
                print(-1)
                exit()
            high = max(high, box[z][i][j])  # 최대값을 갱신하는 방식으로 변경

# 모든 토마토가 익는 데 걸리는 최소 일수를 출력할 때, 초기값 1을 고려하여 1을 빼준다.
print(high-1)  # 모든 토마토가 익는 데 필요한 최소 일수 계산 시, 1을 빼줌