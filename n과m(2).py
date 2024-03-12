n ,m = map(int, input().split())

res = [0] * (m+1)

cnt = 0

def DFS(L, s):
    global cnt
    if L == m:

        for j in range(L):
            print(res[j], end=" ")
        cnt+=1
        print()
        return
    else:
        for i in range(s, n+1):
            res[L] = i
            DFS(L+1, i+1)

DFS(0, 1)