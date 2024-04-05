import heapq
import sys
input = sys.stdin.readline
n = int(input())

hq = []
for i in range(n):
    m = int(input())
    if m:
        heapq.heappush(hq, -m)
    else:
        if hq:
            pop = heapq.heappop(hq)
            print(-pop)
        else:
            print(0)
