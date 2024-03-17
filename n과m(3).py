n, m = map(int, input().split())

res = [0] * (m+1)
def DFS(L):
    if L == m:
        for i in range(L):
            print(res[i], end=" ")
        print()
        return
    else:
        for i in range(1, n+1):
            res[L]=i
            DFS(L+1)


DFS(0)