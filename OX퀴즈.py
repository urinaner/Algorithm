n = int(input())

for i in range(n):
    m = input()
    cnt=1
    sum=0
    for j in range(len(m)):
        if m[j]=='O':
            sum+=cnt
            cnt+=1
        else:
            cnt=1
    print(sum)
        
