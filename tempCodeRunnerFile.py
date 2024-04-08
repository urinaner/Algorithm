def DFS(L):
    global remember
    if L == m:
        for i in range(m):
            print(res[i], end=' ')
        print()
    else:
        for i in range(n):
            if ch[i] == 0 and remember!=arr[i]:
                ch[i] = 1
                res[L] = arr[i]
                remember = arr[i]
                DFS(L+1)
                ch[i] = 0
        remember = 0


n, m = map(int, input().split())
arr = sorted(list(map(int, input().split())))
remember = 0
res = [0] * m
ch = [0] * (n+1)
DFS(0)