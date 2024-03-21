n = int(input())

for i in range(n):
    dp = [[1,0], [0,1], [1,1], [1,2]]
    m = int(input())
    if m < len(dp):
        print(*dp[m])
        continue
    for i in range(4, m+1):
        x, y = dp[i-1][0]+dp[i-2][0],dp[i-1][1]+dp[i-2][1]
        dp.append([x, y])

    print(*dp[m])

