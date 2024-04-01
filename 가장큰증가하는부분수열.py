n = int(input())

arr = list(map(int, input().split()))
arr.append(0)
dp = [1] * (n+1) #증가하는 수열의 합을 저장한다.

dp[0] = arr[0] #첫번째 가장 큰값 

for i in range(1, n): # 2 1 2 => 2 1 3
    for j in range(i+1):
        if arr[i] > arr[j]: #만약 i번째가 더 크다면
            dp[i] = max(dp[i], dp[j] + arr[i]) #증가하는 수열의 j번째에서 i와 비교
        else:
            dp[i] = max(arr[i], dp[i])
        
print(max(dp))