def DFS(L):
    if L == m:
        for i in ch:
            print(i,end=' ')
        print()
        return
    else:
        for i in range(1, m+1):
            ch[L]=i
            DFS(L+1)
        
n, m = map(int, input().split())
ch = [0] * (m)

DFS(0)



