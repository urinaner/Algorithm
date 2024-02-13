n = int(input())

arr = list(map(int ,input().split()))

m = int(input())

sum=0
for i in range(len(arr)-1):
    if arr[i] < m and m < arr[i+1]:
        sum+=(m-arr[i]+arr[i+1]-m)

print(sum)
