n = int(input())

dp = [0] * 1002
dp[1] = 1
dp[2] = 3
dp[3] = 5
dp[4] = 11
for i in range(4, 1001):
    dp[i] = dp[i-2] * 4 -1

print(dp[n] % 10007)