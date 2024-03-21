from collections import deque

n = int(input())

for _ in range(n):
    com = input()
    k = int(input())
    arr = input()

    arr = arr[1:-1]
    
    if arr:
        arr = list(arr.split(","))
    dq = deque(arr)
    
    if k == 0:
        dq = deque()
    

    flag = 1
    R = 0

    for j in range(len(com)):
        
        if com[j] == 'R':
            R +=1
        elif com[j] == 'D':
            if dq:
                if R % 2 == 0:
                    dq.popleft()
                else:
                    dq.pop()
            else:
                print("error")
                flag = 0
                break

    if flag == 0:
        continue
    else:
        if R % 2 == 0:
            print('[' + ",".join(dq) + ']')
        else:
            dq.reverse()
            print('[' + ",".join(dq) + ']')


