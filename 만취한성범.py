T = int(input())

for _ in range(T):
    cnt = 0
    n = int(input()) #n개의 방 0은 닫 1은 열림
    arr = [0] * (n+1)
    #1라운드 1 1 1 1 1
    #2라운드 1 0 1 0 1
    #3라운드 1 0 0 0 1
    #4라운드 1 0 0 1 1
    #5라운드 1 0 0 1 0
    for i in range(1, n+1):
        for j in range(i, n+1, i):
            arr[j] +=1
    for k in arr:
        if k % 2 != 0:
            cnt+=1
    
    print(cnt)
            
    



