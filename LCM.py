n = int(input())

for i in range(n):
    a, b =map(int,input().split())

    tmp = 0
    s = a * b
    while b:
        tmp = b
        b = a % b
        a = tmp
    print(s // a)