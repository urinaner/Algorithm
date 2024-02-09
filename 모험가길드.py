from collections import deque

n = int(input())
m = list(map(int, input().split()))
m.sort(reverse=True)
m = deque(m)
cnt = 0
while m:
    max=m.popleft()
    
    for i in range(max-1):
        m.pop()
    cnt+=1
print(cnt)