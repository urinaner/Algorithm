n, m = map(int, input().split())

sq = []
for _ in range(n):
    sq.append(list(input()))

ans = 1
max = 1
for i in range(n):
    for j in range(m):
        for _ in range(1,n):
            if i+_<n and j+_<m:
                if sq[i][j] == sq[i+_][j]:
                    if sq[i][j] == sq[i][j+_]:
                        if sq[i][j] == sq[i+_][j+_]:
                            ans = (_+1)*(_+1)
                            if max < ans:
                                max = ans
                                

print(max)

        


