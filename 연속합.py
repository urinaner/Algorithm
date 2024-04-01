n = int(input())

arr = list(map(int, input().split()))


dp = [0] * (n)

dp[0] = arr[0]
for i in range(1, n):
    dp[i] = max(dp[i-1] + arr[i], arr[i-1]+arr[i], arr[i] )
    #이전 최장합과 연결, 자신 바로 앞 원소과 연결, 자기 자기자신 이  3가지 경우만 존재
print(max(dp))