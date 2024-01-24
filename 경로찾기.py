import sys

N = int(int(input()))
arr = []
for _ in range(N):
    arr.append(list(map(int, sys.stdin.readline().split()))) #arr생성


for k in range(N):
    for i in range(N):
        for j in range(N):
            if arr[i][k] == 1 and arr[k][j] == 1:
                arr[i][j] = 1

for i in range(N):
    for j in range(N):
        print(arr[i][j], end=' ')
    print()
