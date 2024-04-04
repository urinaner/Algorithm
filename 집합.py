import sys
input = sys.stdin.readline

m = int(input().rstrip())
arr = set()

for _ in range(m):
    com = list(input().rstrip().split())
    if com[0] == 'add':
        arr.add(int(com[1]))
    elif com[0] == 'check':
        if int(com[1]) in arr :
            print(1)
        else:
            print(0)
    elif com[0] == 'remove':
        if int(com[1]) in arr :
            arr.discard(int(com[1]))
    
    elif com[0] == 'toggle':
        if int(com[1]) in arr :
            arr.discard(int(com[1]))
        else:
            arr.add(int(com[1]))
    elif com[0] == 'all':
        arr = set([i for i in range(1, 21)])
    elif com[0] == 'empty':
        arr = set()
