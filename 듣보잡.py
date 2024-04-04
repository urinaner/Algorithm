n, m = map(int, input().split())

s1 = set()
s2 = set()

for i in range(n):
    s1.add(input())

for j in range(m):
    s2.add(input())

answer = sorted(list(s1 & s2))
print(len(answer))

for i in  answer:
    print(i)