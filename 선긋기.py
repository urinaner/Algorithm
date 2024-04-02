import sys
input = sys.stdin.readline
n = int(input())
arr = []
for i in range(n):
    a, b = map(int, input().split())
    arr.append([a,b])

arr.sort(key=lambda x : (x[0],x[1])) #시작 기준 정렬
cnt = arr[0][1]-arr[0][0]
low = arr[0][0]
high = arr[0][1]
for i in range(1, n):
    if arr[i][0] >= low and arr[i][1] >= high and high > arr[i][0]:
        cnt += arr[i][1] - high
        high = arr[i][1]
        low = arr[i][0]
    elif arr[i][0] >= high and arr[i][1] >= high:
        cnt += arr[i][1] - arr[i][0]
        high = arr[i][1]
        low = arr[i][0]


print(cnt)
    

