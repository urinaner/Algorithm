INF = int(1e9)

n = int(input())
m = int(input())

dis = [[INF]* (n+1) for _ in range(n+1) ]
for _ in range(m):
    a, b, c = map(int, input().split())
    dis[a][b] = min(c, dis[a][b])

for i in range(1, n+1):
    dis[i][i]=0
for k in range(1, n+1):
    for i in range(1, n+1):
        for j in range(1, n+1):
            dis[i][j] = min(dis[i][j], dis[i][k]+dis[k][j])

for a in range(1, n + 1):
    for b in range(1, n + 1):
        if dis[a][b] == INF:
            print("0",  end=" ")
        else:
            print(dis[a][b], end=" ")
    print()