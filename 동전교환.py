def DFS(n):
    cnt = 0
    if n == 0:
        return
    else:
        for i in arr:
            if n - i >= 0:
                cnt+=1
                DFS(n-i)
            ans.append(cnt)

n = int(input())
ans = []
arr = list(map(int, input().split()))
m = int(input())
cnt = 0
DFS(m)
ans.sort()
print(ans[-1])