import sys
n = int(sys.stdin.readline()) #입력
d={} #딕셔너리
d_list=[0 for i in range(n + 1)]
d[1]=0
d[2]=1
d[3]=1
cnt=0
for i in range(4, n+1):
    if i%2==0 and i%3==0:
        d[i]=min(d[i//3],d[i//2],d[i-1])+1
        if d[i] == d[i //3] + 1:
            d_list[i] = 3
        elif d[i] == d[i //2] + 1:
            d_list[i] = 2
        else:
            d_list[i] = -1

    elif i % 3 == 0:
        d[i] = min(d[i-1], d[i//3]) + 1
        if d[i] == d[i //3] + 1:
            d_list[i] = 3
        else:
            d_list[i] = -1
    elif i % 2 == 0:
        d[i] = min(d[i-1], d[i//2]) + 1
        if d[i] == d[i //2] + 1:
            d_list[i] = 2
        else:
            d_list[i] = -1
    else:
        d[i] = d[i-1] + 1
        d_list[i] = -1

print(d[n])
k=n
while k > 1:
    print(n, end=" ")

    if d_list[n] == -1:
        k -=1
        n -= 1
    elif d_list[n] == 2:
        n = n // 2
        k = k//2
    else:
        n = n // 3
        k = k//3
print(1)
