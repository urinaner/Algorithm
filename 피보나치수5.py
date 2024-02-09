n = int(input())

def fibo(n):
    sum=n
    sum+=n
    fibo(n-1)
    return sum

fibo(n)
print(sum)