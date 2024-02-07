import sys
from collections import deque
n = input()

m = int(input())

idx=len(n)
n_list = deque(list(n))
m_list = []
for i in range(m):
    com = input().rstrip().strip().split()
    if com[0] == "L":
        if idx == 0:
            continue
        idx-=1
    elif com[0] == "D":
        if idx == len(n)-1:
            continue
        idx+=1
    elif com[0] == "B":
        if idx == 0:
            continue
        else:
            n_list.remove(n[idx-1])
            idx-=1
    elif com[0] == "P":
        n_list.insert(idx, com[1])
        idx +=1

for i in n_list:
    print(i,end='')
