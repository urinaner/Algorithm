n = int(input())

dp = [0] * 91

dp[3] = 2 #100 101
dp[4] = 3 #1000 1010 1001
dp[5] = 4 #10100 10010 10001 10101 

for i in range(6, n+1):
    dp[i] = dp[i-1] + dp[i-2] -1

print(dp[n])