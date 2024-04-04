n = int(input())

dp = [[0] * 10 for _ in range(n+1)] #0 1 2 3 4 5 6 7 8 9 

for i in range(1, 10):
    dp[1][i] = 1 # 1 2 3 4 5 6 7 8 9 0제외

for i in range(2, n+1):
    for j in range(10):
        if j == 0: #0일때 
            dp[i][j] += dp[i-1][j+1]
        elif j == 9: #마지막 9일때
            dp[i][j] += dp[i-1][j-1]
        else: #나머지일때
            dp[i][j] += (dp[i-1][j+1] + dp[i-1][j-1])
    



print(sum(dp[n]) % 1000000000)