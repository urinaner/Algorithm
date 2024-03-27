from collections import deque
m, n, k = map(int, input().split())
#m이 세로 n은 가로 즉 m은 x n은 y
arr = [[0 for _ in range(n)] for j in range(m)]
dx = [1, 0, -1 ,0]
dy = [0, 1, 0, -1]
cnt = 0
answer = []
dq = deque()

for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())

    for i in range(y1, y2):
        for j in range(x1, x2):   
            arr[i][j] = 1


for  i in range(m):
    for j in range(n):
        if arr[i][j] == 0:
            sum = 0
            cnt+=1
            dq.append((i, j))
            
            while dq:
                x, y = dq.popleft()
                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]

                    if 0<=nx<m and 0<=ny<n:
                        if arr[nx][ny] == 0:
                            arr[nx][ny] = 1
                            dq.append((nx,ny))
                            sum+=1
            if sum == 0:
                sum = 1
            answer.append(sum)

answer.sort()
print(cnt)
print(*answer)