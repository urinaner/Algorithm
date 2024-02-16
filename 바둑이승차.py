
def DFS(L):
    if L == m:
        sum = 0
        for i in range(m):
            if ch[i] == 1:
                sum+=arr[i]
        if n > sum:
            ans.append(sum)
        return 
    else:
        ch[L] = 1
        DFS(L+1)
        ch[L] = 0
        DFS(L+1)

n, m = map(int, input().split())

arr = []
ans = []
for i in range(m):
    arr.append(int(input()))


ch = [0] * (m+1)
DFS(0)
ans.sort()
print(ans[-1])