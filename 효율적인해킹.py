from collections import deque
n, m = map(int, input().split())


computer = [[] for k in range(n+1)]
for i in range(m):
    a, b = map(int, input().split())
    computer[b].append(a)

print(computer)

q = deque()

for j in range(1,n+1):
    visited = [False] * (n+1)
    visited[j] = True
    for u in computer[j]:
        q.append(u)
        visited[u]=True
    print('q=',q)
    while q:
        v = q.popleft()
        print('v=',v)
        for l in computer[v]:
            print('l',l)
            if not (visited[l]):
                q.append(l)
                visited[l] = True
    print(visited)

    


