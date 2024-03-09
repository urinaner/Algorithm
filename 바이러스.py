from collections import deque
n = int(input())
m = int(input())

graph =[[False] * (n+1) for _ in range(n+1)]
vistied = [False] * (n+1)

cnt = 0
def DFS(v):
    global cnt
    vistied[v] = True
    cnt +=1

    for i in range(1, n+1):
        if not vistied[i] and graph[v][i]:
            DFS(i)


for i in range(m):
    x, y = map(int, input().split())
    graph[x][y] = 1
    graph[y][x] = 1


def BFS(v):
    q = deque([v])
    vistied[v] = True

    while q:
        v = q.popleft()
        for i in range(1, n+1):
            if not vistied[i] and graph[v][i]:
                q.append(i)
                vistied[i] = True





DFS(1)

print(cnt-1)