import sys
input = sys.stdin.readline
T = int(input())

for _ in range(T):
    dp = []
    n = int(input())
    dp.append(list(map(int, input().split())))
    dp.append(list(map(int, input().split())))
    if n == 1:
        print(max(map(max, dp)))
        continue
        
    dp[0][1] += dp[1][0]
    dp[1][1] += dp[0][0]

    for i in range(2, n):
        dp[0][i] += max(dp[1][i-1], dp[1][i-2])
        dp[1][i] += max(dp[0][i-1], dp[0][i-2])
    
    print(max(map(max, dp)))

