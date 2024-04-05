def DFS(L):
    if L == m:
        return
    else:
        for i in range(1,n+1):
            print(i)

n, m = map(int, input().split())

DFS(0)

