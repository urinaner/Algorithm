n, m = map(int, input().split())

if n==m:
    print(0)
    exit()
print(m-n-1)
for i in range(n+1, m):
    print(i, end=" ")