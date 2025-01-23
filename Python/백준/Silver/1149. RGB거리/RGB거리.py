n = int(input())

arr = []
for i in range(n):
    R, G, B = map(int, input().split())
    arr.append([R, G, B])

dp = [0] * 1000

for i in range(1, n): 
    #앞에 있는 것과 비교한 후 R, G, B를 업데이트 시킨다.
    arr[i][0] = min(arr[i - 1][1], arr[i - 1][2]) + arr[i][0]
    arr[i][1] = min(arr[i - 1][0], arr[i - 1][2]) + arr[i][1]
    arr[i][2] = min(arr[i - 1][0], arr[i - 1][1]) + arr[i][2]

print(min(arr[n - 1]))
