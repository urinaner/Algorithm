n = int(input())

arr = [0] * 1000001

arr[1] = 1
arr[2] = 2
arr[3] = 3
arr[4] = 5
arr[5] = 8
for i in range(5,n+1):
    arr[i] = (arr[i-1]+arr[i-2]) % 15746

print(arr[n])