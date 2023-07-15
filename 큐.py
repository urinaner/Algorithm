import sys
from collections import deque

n = int(sys.stdin.readline())


queue = deque([])
size = 0
for i in range(0, n):
    com = list(map(str, sys.stdin.readline().split()))
    if com[0] == 'push':
        queue.append(com[1])
        size+=1
    elif com[0] == 'pop':
        if size==0:
            print(-1)
        else:
            size-=1
            print(queue.popleft())
    elif com[0] == 'size':
        print(size)
    elif com[0] == 'empty':
        if size!=0:
            print(0)
        else:
            print(1)
    elif com[0] == 'front':
        if size==0:
            print(-1)
        else:
            print(queue[0])
    elif com[0] == 'back':
        if size==0:
            print(-1)
        else:
            print(queue[size-1])

