n, s = map(int, input().split())
arr = list(map(int, input().split()))


cnt = 0
def DFS(L, sum, k):
    global cnt

    if L == n:
        if s == sum and k!=0:
            cnt+=1
            

    else:
        DFS(L+1, sum+arr[L],k+1)
        DFS(L+1, sum, k)


DFS(0,0,0)

print(cnt)