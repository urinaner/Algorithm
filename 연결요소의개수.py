n, m = map(int, input().split())

arr = [[0 for i in range(n+1)] for j in range(n+1)]

for i in range(m):
    a, b = map(int, input().split())
    arr[a][b] += 1 
    arr[b][a] += 1

for i in range(1, n+1):
    for j in range(1, n+1):
        print(arr[i][j], end=" ")
    print()

s = 0
for i in range(1, n+1):
    cnt = 0
    for j in range(1, n+1):
        if arr[i][j] == 1:
            cnt+=1
    if cnt >= 2:
        s += 1

print(s//2)