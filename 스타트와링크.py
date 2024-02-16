n = int(input())

def reculSum(L, idx): #재귀
    global res #불러오기
    if L == n//2:
        x, y = 0, 0
        for i in range(n):
            for j in range(n): #돌면서
                if check[i] and check[j]: #체크하면서
                    x+=arr[i][j]
                elif not check[i] and not check[j]:
                    y+=arr[i][j] #최솟값 저장
        ans.append(abs(x-y))
        return
    else: 
        for i in range(idx, n): #돌면서
            if not check[i]: #방문안했으면
                check[i] = 1 #들어갔다가 
                reculSum(L+1, i+1) #뿌리펼치기
                check[i] = 0 #다시 올땐 방문해제

ans = [] 
arr = [] #배열저장
check = [0] * (n+1) #방문했는지 안했는지
for i in range(n):
    arr.append(list(map(int, input().split()))) #입력

reculSum(0, 0) #level 0부터 index 0부터 시작

ans.sort()
print(ans[0])