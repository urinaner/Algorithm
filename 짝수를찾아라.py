n = int(input())

for _ in range(n):
    arr = map(int, input().split())
    s = 0
    tmp = 2740000000
    for i in arr:
        if i % 2 == 0:
            s += i
            if i < tmp:
                tmp = i
    print(s, end=" ")
    print(tmp)
    


