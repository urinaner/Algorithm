n, m = map(int, input().split())
n2=0
m2=0
while n:
    n2+=n%10
    n2*=10
    n//=10
while m:
    m2+=m%10
    m2*=10
    m//=10

if n2>m2:
    print(n2//10)
else:
    print(m2//10)