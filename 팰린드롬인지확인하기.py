n = input()

count=0
for i in range(0,int(len(n)/2)):
    if n[i] == n[int(len(n))-i-1]:
        count+=1


if int(len(n)/2)==count:
    print(1)
else:
    print(0)
