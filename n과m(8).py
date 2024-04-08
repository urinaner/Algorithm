def DFS(L, s):
    if L == m:
        for i in range(m):
            print(res[i], end=' ')
        print()
    else:
        for i in range(s, n):
            res[L] = arr[i]
            DFS(L+1, i)

n, m = map(int, input().split())
arr = list(map(int, input().split()))
res = [0] * m
arr.sort()
DFS(0, 0)
