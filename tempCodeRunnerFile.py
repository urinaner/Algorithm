n = int(input())

from collections import deque
dq = deque([])

for i in range(n):
    com = input().rstrip().split()
    if com[0] == "push_back":
        dq.append(int(com[1]))
    elif com[0] == "push_front":
        dq.appendleft(int(com[1]))
    elif com[0] == "pop_back":
        if dq:
            print(-1)
        else:
            print(dq.pop())
    elif com[0] == "pop_front":
        if dq:
            print(-1)
        else:
            print(dq.popleft())
    elif com[0] == "size":
        print(len(dq))
    elif com[0] == "empty":
        if dq:
            print(0)
        else:
            print(1)
    elif com[0] == "front":
        if dq:
            print(dq[0])
        else:
            print(-1)
    elif com[0] == "back":
        if dq:
            print(dq[-1])
        else:
            print(-1)
