n = input().split('-')

arr = []
for i in n:
    arr.append(i.split("+"))

last = []
for i in arr:
    tmp = 0
    for j in i:
        tmp+= int(j)
    last.append(tmp)

print(last[0]-sum(last[1:]))