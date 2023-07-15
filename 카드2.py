# from collections import deque


# n = int(input())

# queue = []
# for i in range(1, n+1):
#     queue.insert(0, i)

# while len(queue)!=1:
#     queue.pop()
#     tmp = queue.pop()
#     queue.insert(0, tmp)
# print(*queue)


import sys
from collections import deque
queue=deque([]) #디큐 선언
N=int(sys.stdin.readline()) #입력

for i in range(N):
    queue.append(i+1) #1~N 입력

while len(queue)>1: #길이가 1이면 종료
    queue.popleft() #앞쪽에서 제거
    if (len(queue)>1):
        queue.append(queue.popleft())
    else:
        break
print(queue.popleft())
