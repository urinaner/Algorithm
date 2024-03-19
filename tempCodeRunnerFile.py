n = int(input())

room=[]

dx = [1,1,0]
dy = [0,1,1]
for i in range(n):
    room.append(list(input()))

rowCnt=0
for i in range(n):
    for j in range(n):
        if room[i][j] == ".":
            dx = i 
            dy = j + 1
            if 0<=dx<n and 0<=dy<n:
                if room[dx][dy]==".":
                    rowCnt+=1
                    break
columnCont=0

for j in range(n):
    for i in range(n):
        if room[i][j] == ".":
            dx = i + 1
            dy = j 
            if 0<=dx<n and 0<=dy<n:
                if room[dx][dy]==".":
                    columnCont+=1
                    break

              

            

print(rowCnt, columnCont)
        
