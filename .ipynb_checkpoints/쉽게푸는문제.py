n, m=map(int, input().split())

problem=[]
cnt=1
for i in range(0,m):
    for j in range(0, cnt):
        problem.append(cnt)
    cnt+=1

sum=0
for k in range(n-1, m):
    sum+=problem[k]

print(sum)