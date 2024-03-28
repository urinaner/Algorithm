from collections import deque
F, S, G, U, D = map(int, input().split())

dis = [0] * 1000001
ch = [0] * 1000001

dq = deque()
dq.append(S)

ch[S] = 1 #쳌

while dq:
    now = dq.popleft()
    if now == G:
        break
    for next in(now+U, now-D):
        if 1<=next<=F:
            if ch[next] == 0:
                ch[next] = 1
                dq.append(next)
                dis[next] = dis[now] + 1

if now == G:
    print(dis[now])
else:
    print("use the stairs")

            
