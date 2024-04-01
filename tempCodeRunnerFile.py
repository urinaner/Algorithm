n = int(input())

arr = list(map(int, input().split()))


dp = [0] * (n+1)

dp[0] = 1

max = arr[0]
for i in range(1, n):
    if arr[i] > max:
        max = arr[i]
        dp[i] = dp[i-1]+ 1
    else:
        dp[i] = dp[i-1]

print(dp[n-1])
