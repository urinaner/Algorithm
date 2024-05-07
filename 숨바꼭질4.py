from collections import deque
n, k = map(int, input().split())

ch = [0] * (100001)
dis = [0] * (100001)

ch[n] = 0
dis[n] = 0

dq = deque([n])
while dq:
    now = dq.popleft()
    if now == k:
        print(ch[now])
        answer = []
        while now!=n:
            answer.append(now)
            now = dis[now]
        answer.append(now)
        answer.reverse()
        print(*answer)
        exit()

    for next in(now-1, now+1, now*2):
        if 0<=next<100001:
            if ch[next] == 0:
                ch[next] = ch[now] + 1
                dis[next] = now
                dq.append(next)

            