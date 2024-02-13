x = int(input())

sum = 0
n = int(input())
for i in range(n):
    a, b = map(int, input().split())
    sum+=(a*b)

if x == sum:
    print('Yes')
else:
    print('No')
