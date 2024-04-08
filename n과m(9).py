def DFS(L):
    if L == m:
        for i in range(m):
            print(res[i], end=' ')
        print()
    else:
        remember = 0
        for i in range(n):
            if ch[i] == 0 and remember!=arr[i]:
                ch[i] = 1
                res[L] = arr[i]
                remember = arr[i]
                DFS(L+1)
                ch[i] = 0
        


n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
res = [0] * (m+1)
ch = [0] * (n+1)
DFS(0)