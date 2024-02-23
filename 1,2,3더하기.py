n = int(input())

dy = [0] * (11)
dy[1] = 1
dy[2] = 2
dy[3] = 4
dy[4] = 7
dy[5] = 13
for _ in range(n):
    m = int(input())
    for i in range(5, m+1):
        dy[i] = dy[i-1] + dy[i-2] + dy[i-3]

    print(dy[m])
