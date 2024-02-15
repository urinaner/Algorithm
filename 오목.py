def gameWin(i, j, arr):
    global cnt #오목 개수
    global x #오목 방향

    if cnt > 4: #육목 제거
        if ans:
            ans.pop()
            ans.pop()
        return False

    elif cnt == 4: #오목 5개 True
        ans.append([i,j,arr[i][j]])
        return True
   
    elif arr[i][j]==0: #0일때 제외
        return False
    
    elif i < 0 or i > 19 or j < 0 or j >= 19: #배열 초과하면 나감
        return False
    
    elif x != 999: #방향 설정
        dx = nx[x] + i
        dy = ny[x] + j
        if 0<=dx<19 and 0<=dy<19:
            if arr[i][j] == arr[dx][dy]:
                cnt+=1
                gameWin(dx,dy,arr)

    else:
        for _ in range(8): #방향 찾기
            dx = nx[_] + i
            dy = ny[_] + j
            if 0<=dx<19 and 0<=dy<19:
                if arr[i][j] == arr[dx][dy]: 
                    cnt=1
                    x = _
                    gameWin(dx,dy,arr) #
        return False
arr = [] #저장 배열

ans = []
for i in range(19):
    arr.append(list(map(int, input().split())))

nx = [1, 1, 1, -1, -1, -1, 0, 0]
ny = [0, -1, 1, 0, -1, 1, 1, -1]

for i in range(19):
    for j in range(19):
        cnt = 0
        x = 999
        gameWin(i,j,arr)

if ans:     
    ans.sort()
    print(ans[0][2])
    print(ans[0][0]+1,ans[0][1]+1)
else:
    print(0)
