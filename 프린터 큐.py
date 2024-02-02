from collections import deque


x = int(input())

for i in range(x):
    n, m = map(int, input().split())
    rank=0
    dq = deque([(pos, val) for pos, val in enumerate(list(map(int, input().split())))])
    while 1:
        idx=dq.popleft()
        if any(idx[1] < x[1] for x in dq):
            dq.append(idx)
        else:
            rank+=1
            if idx[0] == m:
                print(rank)
                break
            
            

