tmp = 2740000000
s = 0
for _ in range(7):
    n = int(input())
    if n % 2 != 0:
        s+=n
        if n < tmp:
            tmp = n
if s==0:
    print(-1)
else:
    print(s)
print(tmp)

