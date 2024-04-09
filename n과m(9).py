def DFS(L, s):
    if L == m:
        for i in range(m):
            print(res[i], end=' ')
        print()
    else:
        remember = 0
        for i in range(s, n):
            if ch[i] == 0 and remember!=arr[i]:
                ch[i] = 1
                res[L] = arr[i]
                remember = arr[i]
                DFS(L+1, i)
                ch[i] = 0
        


n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
res = [0] * (m+1)
ch = [0] * (n+1)
DFS(0, 0)