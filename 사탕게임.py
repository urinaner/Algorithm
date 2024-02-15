def maxCandy(i, j, arr):
    global n
    global cnt

    if i >= n or j >= n:
        return False
    elif cnt == n:
        return False
    else:
        for x in range(2):
            
    
    


n = int(input())

nx = [1, 0]
ny = [0, 1]
arr = []
for i in range(n):
    arr.append(list(input()))

print(arr)

for i in range(n):
    for j in range(n):
        cnt = 0
        maxCandy(i, j, arr)