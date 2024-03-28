from collections import deque
n = int(input())

dx = [0, 1, -1, 0]
dy = [1, 0, 0, -1]
arr = []
for i in range(n):
    arr.append(list(map(int, input().split())))

answer = []
dq = deque()
maxhigh = max(map(max, arr)) #최고높이
for _ in range(maxhigh, -1, -1):
    ch =[[0 for i in range(n)] for j in range(n)]

    for i in range(n):
        for j in range(n):
            if arr[i][j] <= _:
                ch[i][j] = 1

    cnt = 0
    for i in range(n):
        for j in range(n):
            if ch[i][j] == 0:
                cnt += 1
                dq.append((i, j))

                while dq:
                    x, y = dq.popleft()
                    
                    for k in range(4):
                        nx = dx[k] + x
                        ny = dy[k] + y

                        if 0<=nx<n and 0<=ny<n:
                            if ch[nx][ny] == 0:
                                ch[nx][ny] = 1
                                dq.append((nx, ny))
    answer.append(cnt)

if max(answer) != 0:
    print(max(answer))
else:
    print(1)