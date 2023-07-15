n = int(input())

for i in range(1,n+1):
    for _ in range(i,n):
        print("",end=" ")
    for j in range(0,i*2-1):
        print("*",end="")
    print("")

for i in range(1,n):
    for j in range(0,i):
        print("",end=" ")
    for _ in range(i*2,n*2-1):
        print("*",end="")
    if i<n-1:
        print("")

    


