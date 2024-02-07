from collections import deque
import heapq
x = int(input())

time = []
for _ in range(x):
    time.append(list(map(int, input().split())))

time.sort()

cnt = 1
time.sort()
heap = []
heapq.heappush(heap, time[0][1])
for i in range(1, x):
    if time[i][0] >= heap[0]:
        heapq.heappop(heap)
    else:
        cnt+=1
    
    heapq.heappush(heap, time[i][1])
print(cnt)






