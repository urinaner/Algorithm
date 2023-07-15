n, k = map(int, input().split())
list = []

for i in range(0, n):
    m = int(input())
    list.append(m)

cnt = 0
x = len(list)-1
while k>=1:
    if k / list[x] >= 1:
        cnt = cnt + int((k/list[x]))
        k = k%list[x]
        
    x = x -1
print(cnt)

