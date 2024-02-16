def DFS(v):
    if n+1 == v:
        for i in range(1,n+1):
            if ch[i] == 1:
                print(i, end=" ")
        print()
        return
    else:
        ch[v]=1
        DFS(v+1)
        ch[v]=0
        DFS(v+1)


n = int(input())
ch = [0] * (n+1)
DFS(1)