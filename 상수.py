n, m = map(int, input().split())
n2=0
m2=0
while n:
    n2+=n%10
    n2*=10
    n/=10

print(n2)