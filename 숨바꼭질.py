from collections import deque

n , m = map(int, input().split())

ch = [0] * (100001)
dis = [0] * (100001)

ch[n] = 1 #체크
dis[n] = 0

dq = deque()
dq.append(n)

while dq:
    now = dq.popleft() #빼서
    if now == m: #같으면 탈출
        break
    for next in (now-1, now+1, now*2): #상태트리 생성
        if 0<=next<=100000:
            if ch[next] == 0:  #방문 안햇고, next가 정상범위면       
                dq.append(next) #큐에 추가
                ch[next] = 1 #방문처리
                dis[next] = dis[now] + 1 #거리 증가 + 1
        
print(dis[m]) #거리 m 출력
            



