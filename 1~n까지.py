def fuc1(n):
    if n == 1:
        return 1
    elif n % 2 != 0:
        return fuc1(n-1) + n
    else:
        return 2 * fuc1(n//2) + n*n//4

n = int(input())
print(fuc1(n))