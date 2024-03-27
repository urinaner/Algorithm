n = int(input())
dp = [0] * 1001
#0은 상근 1은 창영으로 설정
dp[1] = 0
dp[2] = 1
dp[3] = 0
dp[4] = 0
dp[5] = 0
dp[6] = 0 # 4 1 1
dp[7] = 1 # 1 4 1 1
for i in range(8, 1001):
    if dp[i-1] == 1 or dp[i-3] == 1 or dp[i-4] == 1:
        dp[i] = 0
    else:
        dp[i] = 1

if dp[n] == 0:
    print("SK")
else:
    print("CY")