m, n = map(int, input().split())

ch = [0] * 1000001
answer = []
for i in range(2, n+1):
    if ch[i] == 0:
        if m<=i<=n:
            answer.append(i)
        for j in range(i, n+1, i):
            ch[j] += 1

for i in answer:
    print(i)