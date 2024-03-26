from collections import deque
T = int(input())

dx = [1, 0, -1, 0]
dy = [0, -1, 0, 1]
for _ in range(T):
    m, n, k = map(int, input().split())
    arr = [[0 for j in range(n)] for i in range(m)]

    for i in range(k):
        a, b = map(int, input().split())  #입력받고 
        arr[a][b] = 1 #적용
    
    dq = deque()
    
    cnt = 0
    for i in range(m):
        for j in range(n):
            if arr[i][j]: #1이면 들어간다.
                cnt+=1
                dq.append((i, j))
                while dq: #q에 쳐넣고
                    x, y = dq.popleft()
                    for k in range(4):
                        nx = dx[k] + x
                        ny = dy[k] + y

                        if 0 <= nx < m and 0<= ny < n and arr[nx][ny] == 1:
                            arr[nx][ny] = 0
                            dq.append((nx, ny))

    print(cnt)

