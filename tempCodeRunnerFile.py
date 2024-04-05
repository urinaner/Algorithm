from collections import deque
n, m = map(int, input().split())

arr = [[] for _ in range(n+1)]

for i in range(m):
    a, b = map(int, input().split())
    arr[a].append(b)
    arr[b].append(a)

check = [False] * (n+1)
cnt = 0
dq = deque()
for i in range(n+1):
    if not check[i]:
        cnt+=1
        check[i] = True
    else:
        dq.append(i)
        check[i] = True
        while dq:
            node = dq.popleft()
            for i in arr[node]:
                if not check[i]:
                    check[i] = True
                    dq.append(i)
        cnt+=1

print(cnt)