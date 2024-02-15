def fibo(n):
    if n == 1:
        return 1
    return n * fibo(n-1)


n = int(input())
print(fibo(n))
