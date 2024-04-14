N = int(input())

def DFS(L, sum):
    global res
    if L == N+1:
        if res < sum:
            res = sum
    else:
        if L+day[L] <= N+1:
            DFS(L+day[L], sum+profit[L])
        DFS(L+1, sum)



day = [0]
profit = [0]
for i in range(N):
    a, b = map(int, input().split())
    day.append(a)
    profit.append(b)

res = -27600000
DFS(1,0)
print(res)

#DP코드
# n = int(input())
# schedule = []
# dp = [0] * (n+1)
# for i in range(1,n+1):
#     a, b = map(int, input().split())
#     schedule.append([a,b])

# for i in range(n):
#     for j in range(i+schedule[i][0], n+1):
#         if dp[j] < dp[i] + schedule[i][1]:
#             dp[j] = dp[i] + schedule[i][1]

# print(dp[-1])


    
