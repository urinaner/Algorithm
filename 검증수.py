#1046

arr = list(map(int, input().split()))
s = 0
for i in arr:
    s += i * i

print(s%10)