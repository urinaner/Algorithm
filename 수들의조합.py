n, k = map(int, input().split())

arr = list(map(int, input().split()))
m = int(input())
idx = [0] * (k+1)


def DFS(L):
    if L == k:
        for i in range(k): 
            print(idx[i], end=" ")
        print()
        return
    else:
        for i in range(k):
            if idx[i] == 0:
                idx[i] = arr[i]
                DFS(L+1)
                idx[i] = 0
 
DFS(0)
