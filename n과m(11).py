def DFS(L):
    if L == m:
        for i in range(m):
            print(res[i], end=" ")
        print()
    else:
        remember = 0
        for i in range(n):
            if remember != arr[i]:
                res[L] = arr[i]
                remember = arr[i]
                DFS(L+1)

n, m = map(int, input().split())
arr = list(map(int, input().split()))
res = [0] * m
arr.sort()
DFS(0)