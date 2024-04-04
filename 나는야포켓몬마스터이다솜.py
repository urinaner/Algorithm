import sys
input = sys.stdin.readline
n, m = map(int, input().split())
arr = {}
for i in range(1,n+1):
    mon = input().rstrip()
    arr[str(i)] = mon
    arr[mon] = i

for j in range(m):
    answer = input().rstrip()
    print(arr[answer])
