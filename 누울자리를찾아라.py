n = int(input())

room=[]

for i in range(n):
    room.append(list(input()))

rowCnt=0
cnt = 0 
for i in range(n):
    for j in range(n):
        if room[i][j] == ".":
            cnt+=1
        else:
            if cnt>=2:
                rowCnt+=1
            cnt = 0
    if cnt >= 2:
        rowCnt+=1
    cnt=0

columnCont=0
cnt=0
for j in range(n):
    for i in range(n):
        if room[i][j] == ".":
            cnt+=1
        else:
            if cnt>=2:
                columnCont+=1
            cnt = 0
    if cnt >= 2:
        columnCont+=1
    cnt=0

print(rowCnt, columnCont)
