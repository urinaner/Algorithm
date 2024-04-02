n = int(input())


cnt = 1
i=1
while n>1:
    n-=6*i
    cnt+=1
    i+=1

print(cnt)