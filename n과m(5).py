def DFS(L, s):
    if L == m:
        for i in range(m):
            print(res[i], end=" ")
        print()
    else:
        for i in range(n):
            if ch[i] == 0:
                ch[i] = 1
                res[L] = arr[i]
                DFS(L+1, i)
                ch[i] = 0


n, m = map(int, input().split())
arr = list(map(int, input().split()))
res = [0] * (m+1)
ch = [0] * (n+1)
arr.sort()
DFS(0, 0)

