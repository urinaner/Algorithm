def DFS(L, S):
    if L == m:
        for i in range(m):
            print(res[i], end=" ")
        print()
    else:
        for i in range(1, n+1):
            if S<=i:
                res[L] = i
                DFS(L+1, i)

n, m = map(int, input().split())

res = [0] * (m+1)
ch = [0] * (m+1)

DFS(0, 1)

