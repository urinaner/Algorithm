import heapq

n = int(input())
arr = []

for i in range(n):
    start, end = map(int, input().split())
    arr.append([start, end])

arr.sort()#시직하는 시간으로 정렬.

hq = []

heapq.heappush(hq, arr[0][1]) #가장 일찍 시작해서 끝나는시간 추가

for i in range(1, n):
    if arr[i][0] < hq[0]: #끝나는 시간이 시작하는 시간보다 크면
        heapq.heappush(hq, arr[i][1]) #끝나는 시간 추가
    else: #순서가 맞으면
        heapq.heappop(hq) #빼내고
        heapq.heappush(hq, arr[i][1]) #끝나는 시간 추가해준다. 

print(len(hq)) #이렇게 되면 마지막엔 회의실의 개수가 남는다.