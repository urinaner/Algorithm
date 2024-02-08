n, x, y = map(int, input().split())
arr = [i for i in range(1, n+1)]

cnt=0

while x!=y:
    x-=x//2
    y-=y//2

    cnt+=1
print(cnt)



