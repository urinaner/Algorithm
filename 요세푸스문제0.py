import sys
sys.setrecursionlimit(50000000)
from collections import deque
N,K=map(int,sys.stdin.readline().split())
liA=deque([])
liB=[]
for i in range(N):
    liA.append(i+1) #입력

def yo(n):
    if len(liA)==0:
        return
    elif (n)%K==0:
        liB.append(liA[0])
        liA.popleft()
    else:
        liA.append(liA[0])
        liA.popleft()
    return yo(n+1)

yo(1)
print("<",end="")
for _ in liB:
    print(_,end=",")
print(">",end="")