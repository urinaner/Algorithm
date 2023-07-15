n = int(input())

for _ in range(0, n):
    a, b = map(int, input().split())
    i = 1
    while 1:
        if a%i==0 and b%i==0:
            LCM = (a/i)*(b/i)*i
            i+=1
        else:
            break
    print(int(LCM))
        