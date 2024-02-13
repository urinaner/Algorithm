from collections import deque #선언

def bfs(x, y):
    a[x][y] = 0 #0으로 세팅
    dx = [1, -1, 0, 0] #좌표
    dy = [0, 0, 1, -1] #좌표
    w = 1 #넓이
    q = deque() #큐
    q.append([x, y]) #큐 안에 넣기
    while q: #큐가 빌때까지 진행
        x, y = q.popleft() #뽑아서
        for i in range(4): #변화되는 좌표
            nx = dx[i] + x #x
            ny = dy[i] + y #y   
            if 0 <= nx < n and 0 <= ny < m and a[nx][ny] == 1: #이동한값이 1이면서 초과안했다면
                q.append([nx, ny]) #q에 다시 넣는다
                a[nx][ny] = 0 #0으로 변환
                w += 1 #넓이 증가
    return w


n, m = map(int, input().split()) #행 열 입력
a = [list(map(int, input().split())) for _ in range(n)] #2차원배열 입력
cnt = 0 #그림 개수
ans = 0 #넓이 
for i in range(n):
    for j in range(m): #전부 탐색하기
        if a[i][j] == 1: #1이면 탐색
            cnt += 1 #개수 증가
            ans = max(bfs(i, j), ans) #가장큰거 초기화

print(cnt)
print(ans)
