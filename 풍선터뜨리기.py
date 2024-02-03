import sys
from collections import deque
n = int(input())

Q=[(pos, val) for pos, val in enumerate(list(map(int, input().split())))]

dq = deque(Q)
ans = []
while dq:
    num=dq.popleft()
    ans.append(num[0]+1)
    if num[1] < 0:
        dq.rotate(-(num[1]))
    else:
        dq.rotate(-(num[1]-1))

print(' '.join(map(str, ans)))