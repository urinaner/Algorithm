n, m = map(int, input().split())

dp = [0] * (m+1)
for _ in range(n):
    w, v = map(int, input().split())

    # 역순으로 루프를 돌며 최대 가치 계산
    for j in range(m, w-1, -1):
        dp[j] = max(dp[j], dp[j-w]+v)

# 최종 결과 출력
print(dp[m])