n = int(input())

arr = [0]
for i in range(n):
    arr.append(int(input()))

dy = [0] * (n+1)

dy[1] = arr[1]
for i in range(2, n+1):
    dy[i] = dy[i-1]+arr[i]