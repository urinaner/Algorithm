
n = int(input())

dp = [0] * 1001
#0 = 상근 1 = 창영
dp[1] = 0
dp[2] = 0
dp[3] = 0
dp[4] = 1 # 1 3
dp[5] = 0 # 1 3 1
dp[6] = 1 # 1 1 3 1
dp[7] = 0 # 3 1 3

for i in range(5, n+1):
    dp[i] = dp[i-3] + 1
    if dp[i] == 2:
        dp[i] = 0


if dp[n] == 1:
    print("SK")
else:
    print("CY")

