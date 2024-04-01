from collections import deque
n = int(input())

arr = []
for i in range(n):
    arr.append(list(map(int, input())))




dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

dq = deque()

answer = []
cnt = 0

for i in range(n):
    for j in range(n):
        s = 1
        if arr[i][j] == 1:
            cnt+=1
            dq.append((i , j))
            arr[i][j] = 0

            while dq:
                x, y = dq.popleft()
                for k in range(4):
                    nx = x + dx[k]
                    ny = y + dy[k]
                    if 0<=nx<n and 0<=ny<n and arr[nx][ny] == 1:
                        arr[nx][ny] = 0
                        s+=1
                        dq.append((nx, ny))
            answer.append(s)


print(cnt)
answer.sort()

for i in answer:
    print(i)