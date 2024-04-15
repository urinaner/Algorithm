n, m = map(int, input().split())

if n>m:
    n, m = m, n
if n==m or n-m==1 or m-n==1:
    print(0)
    exit()
print(m-n-1)
for i in range(n+1, m):
    print(i, end=" ")