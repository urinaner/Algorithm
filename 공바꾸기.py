n, m = map(int, input().split())
intergers = [i for i in range(1, n+1)]
for j in range(0,m):
    a, b = map(int, input().split())
    tmp=0
    tmp=intergers[a-1]
    intergers[a-1]=intergers[b-1]
    intergers[b-1]=tmp

for i in intergers:
    print(i,end=" ")
    