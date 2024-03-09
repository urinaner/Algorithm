n = int(input())

stairs = [0]
for i in range(n):
    stairs.append(int(input()))

dp = [0] * (n+1)
dp[1] = stairs[1]
dp[2] = stairs[1] + stairs[2]
dp[3] = max(stairs[1]+stairs[3], stairs[2]+stairs[3])

for i in range(4,n+1):
    dp[i] = max(dp[i-3]+stairs[i-1]+stairs[i], dp[i-2]+stairs[i])

print(dp[n])