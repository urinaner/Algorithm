import sys
input = sys.stdin.readline
n = int(input())

for i in range(n):
    sum = 0
    m = int(input())
    arr = list(map(int, input().split()))

    max = 0
    for j in range(m-1, -1, -1):
        if arr[j] > max:
            max = arr[j]
        
        elif arr[j] < max:
            sum+= (max-arr[j])
    print(sum)

