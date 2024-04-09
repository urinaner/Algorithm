from collections import deque
n = int(input())
graph = [[] for _ in range(n+1)]
visited = [0] * (n+1)
answer = [0] * (n+1)
for i in range(n-1):
    a, b =  map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)


dq = deque([1])
while dq:
    now = dq.popleft()
    for i in graph[now]:
        if visited[i] == 0:
            answer[i] = now
            visited[i] = 1
            dq.append(i)

for i in range(2, n+1):
    print(answer[i])