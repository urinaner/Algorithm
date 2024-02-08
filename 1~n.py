def func1(n):
    if n == 0:
        return
    print(n)
    return func1(n-1)

def fuc2(n):
    if n == 0:
        return 0
    return n+fuc2(n-1)

func1(10)
print(fuc2(10))