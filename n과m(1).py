n, m = map(int, input().split())

for i in range(1,n+1):
    cnt=0
    for j in range(i, n+1):
        cnt+=1
        if cnt == m:
            print(i, j)
