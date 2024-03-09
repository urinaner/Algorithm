n = int(input())
n=1000-n
arr = [500, 100, 50, 10, 5, 1]


cnt = 0

for i in arr:
    if n >= i :
        cnt += (n //i)
        n = n % i
print(cnt)
        
