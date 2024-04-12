from collections import deque
import sys
input = sys.stdin.readline

n, m = map(int, input().split())

ch = [0] * 100001
dis = [0] * 100001
cnt = 0
tmp = 0
ch[n] = 1
dq = deque([n])
answer = -1
while dq:
    now = dq.popleft()
    if now == m:
        cnt+=1
        answer = dis[m]
        continue

            
    for next in (now+1, now-1, now*2):
        if 0<=next<100001 and (dis[next] == 0 or dis[next] == dis[now]+1):
            if ch[next] == 0:
                dis[next] = dis[now] + 1
                dq.append(next)

print(answer)
print(cnt)