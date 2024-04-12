from collections import deque
import sys
input = sys.stdin.readline
n, m = map(int, input().split())

ch = [0] * (100001)
dis = [0] * (100001)

ch[n] = 1
dis[n] = 0

dq = deque([n])

while dq:
    now = dq.popleft()
    if now == m:
        break

    for next in (now*2, now+1, now-1):
        if 0<=next<100001:
            if ch[next]==0:
                ch[next] = 1
                if next == now * 2:
                    dis[next] += dis[now]
                else:
                    dis[next] += dis[now] + 1
                dq.append(next)

            
print(dis[m])