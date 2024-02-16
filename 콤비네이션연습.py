
def DFS(L):
    global cnt
    if L == m:
        cnt+=1
        for i in range(m):
            print(arr[i], end=" ")
        print()
        return
    else:
        for i in range(1, n+1):
            if check[i] == 0:
                check[i] = 1
                arr[L]=i
                DFS(L+1)
                check[i] = 0


n, m = map(int,input().split())

arr = [0] * (n)
check = [0] * (n+1)
cnt = 0
DFS(0)

print(cnt)