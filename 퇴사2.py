import sys
input = sys.stdin.readline
n = int(input())
T = []
P = []
dp = [0] * (n+1)
for _ in range(n):
    a, b = map(int, input().split())
    T.append(a)
    P.append(b)

for i in range(n-1, -1 , -1):
    if i+T[i] <= n:
        dp[i] = max(dp[i+1], dp[i + T[i]]+P[i])
    else:
        dp[i] = dp[i+1]

print(dp[0])