# import sys
# input = sys.stdin.readline
# n, m = map(int, input().split())
# arr = []
# for _ in range(n):
#     arr.append(list(map(int, input().split())))

# for _ in range(m):
#     sum = 0
#     x1, y1, x2, y2 = map(int, input().split())
#     for i in range(x1-1, x2):
#         for j in range(y1-1, y2):
#             sum+=arr[i][j]
#     print(sum)
import sys
input = sys.stdin.readline
n, m = map(int, input().split())
arr = []
dp = [[0] * (n+1) for i in range(n+1)]
for _ in range(n):
    arr.append(list(map(int, input().split())))


for i in range(1, n+1):
    for j in range(1, n+1):
        dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + arr[i-1][j-1]


for _ in range(m):
    x1, y1, x2, y2 = map(int, input().split())
    print(dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1])
    print(dp[x2][y2])
    print(dp[x1-1][y2])
    print(dp[x2][y1-1])
    print(dp[x1-1][y1-1])
    for k in range(1,n+1):
        for k2 in range(1, n+1):
            print(dp[k][k2], end=" ")
        print()