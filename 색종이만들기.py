n = int(input())
arr = []
blue = 0
white = 0


def paper(n, x_start, x_end, y_start, y_end):
    global blue
    global white 
    x_mid = (x_start + x_end) //2 
    y_mid = (y_start + y_end) //2 

    if n==1:
        return
    
    cnt = 0
    for i in range(y_start, y_mid+1): #4분면
        for j in range(x_start, x_mid+1):
            if arr[i][j] == 1:
                cnt+=1
    if cnt == n//2 * n//2:
        blue +=1    
    elif cnt == 0:
        white +=1
    else:
        paper(n//2, x_mid, x_end, y_mid, y_end)

    cnt = 0
    for i in range(0, y_start):
        for j in range(x_start, x_mid+1): #2분면
            if arr[i][j] == 1:
                cnt+=1
    if cnt == n//2 * n//2:
        blue +=1    
    elif cnt == 0:
        white +=1
    else:
        paper(n//2, x_mid, x_end, 0, y_start)


    cnt = 0
    for i in range(0, y_start):
        for j in range(0, x_start): #1분면
            if arr[i][j] == 1:
                cnt+=1
    if cnt == n//2 * n//2:
        blue +=1    
    elif cnt == 0:
        white +=1
    else:
        paper(n//2, 0, x_start, 0, y_start)

    cnt = 0
    for i in range(n//2, n): #3분면
        for j in range(n//2+1):
            if arr[i][j] == 1:
                cnt+=1

    if cnt == n//2 * n//2:
        blue +=1 
    
    elif cnt == 0:
        white +=1
    else:
        paper(n//2, 0, x_mid, y_mid, y_end)


for i in range(n):
    arr.append(list(map(int, input().split())))


x_start = 0
x_end = n
y_start = 0
y_end = n

paper(n, x_start, x_end, y_start, y_end)
print(blue)
print(white)
