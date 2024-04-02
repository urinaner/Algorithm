from collections import deque
m, n = map(int, input().split())
arr = []
for i in range(n):
    arr.append(list(map(int, input().split())))

dq = deque()
dx = [1, 0, -1, 0]
dy = [0, 1, 0, -1]
s = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == 1:
            dq.append((i, j))
            
while dq:
    x, y = dq.popleft()
    for k in range(4):
        nx = dx[k] + x
        ny = dy[k] + y
        

        if 0<=nx<n and 0<=ny<m:
            if arr[nx][ny] == 0:
                arr[nx][ny] = arr[x][y] + 1
                dq.append((nx, ny))
for i in range(n):
    for j in range(m):
        if arr[i][j] == 0:
            print(-1)   
            exit()     
print(max(map(max,arr))-1)      
