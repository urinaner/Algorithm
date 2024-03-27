from collections import deque
n = int(input())

dx = [1, 1, -1, -1, 2, 2, -2, -2]
dy = [2, -2, 2, -2, 1, -1, 1, -1]
for i in range(n):
    m = int(input())
    dis = [[0 for _ in range(m)] for i in range(m)]
    ch = [[0 for _ in range(m)] for i in range(m)]

    x, y = map(int, input().split())
    goal_x, goal_y = map(int, input().split())

    ch[x][y] = 1
    dis[x][y] = 0

    dq = deque()
    dq.append((x, y))

    while dq:
        now_x, now_y = dq.popleft()

        if now_x == goal_x and now_y == goal_y:
            print(dis[now_x][now_y])
            break

        for j in range(8):
            nx = now_x + dx[j]
            ny = now_y + dy[j]

            if 0<=nx<m and 0<=ny<m:
                if ch[nx][ny] == 0:
                    ch[nx][ny] = 1
                    dis[nx][ny] = dis[now_x][now_y] + 1
                    dq.append((nx, ny))
    
    






