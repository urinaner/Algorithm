from collections import deque
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
degree = [0] * (n+1)
arr = [[] for _ in range(n+1)]
dq = deque()
for _ in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    degree[b]+=1

for i in range(1, n+1):
    if degree[i] == 0:
        dq.append(i)

while dq:
    now = dq.popleft()
    print(now, end=" ")
    for i in arr[now]:
        degree[i]-=1
        if degree[i] == 0:
            dq.append(i) 
