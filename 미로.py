from collections import deque
n, m = map(int, input().split())

arr =[]
for _ in range(n):
    arr.append(list(map(int, input())))

dy = [1, 0, -1, 0]
dx = [0, 1, 0, -1]


cnt = 0
def BFS(x, y):
    q = deque()
    q.append((x,y))

    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < n and 0 <= ny < m and arr[nx][ny]==1:
                q.append((nx,ny))
                arr[nx][ny] = arr[x][y] + 1 

    return arr[n-1][m-1]
                
    





print(BFS(0, 0))