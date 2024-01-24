from collections import deque
n, m = map(int, input().split())

n=list(map(int, str(n)))

stack = []
for _ in n:
    while stack and m>0 and stack[-1] < _:
        stack.pop()
        m-=1
    stack.append(_)
stack = stack[:-m]
print(stack)
for i in stack:
    print(i,end='')