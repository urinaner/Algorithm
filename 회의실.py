n = int(input())

arr = []
for i in range(n):
    start , end= map(int , input().split())
    arr.append((start, end))

arr.sort(key=lambda x: (x[1], x[0]))

tmp = 0
cnt = 0
for start, end in arr:
    if tmp <= start:
        tmp = end
        cnt+=1
print(cnt)