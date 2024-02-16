def DFS(n):
    if n > 20:
        return
    else:
        
        DFS(n*2)
        print(n)
        DFS(n*2+1)


DFS(1)