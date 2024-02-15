arr = []
sum = 0
for i in range(9):
    a=int(input())
    sum+=a
    arr.append(a)

for i in range(8):
    for j in range(i+1, 9):
        if (sum-arr[i]-arr[j]) == 100:
            x = arr[i]
            y = arr[j]
            arr.remove(x)
            arr.remove(y)
            arr.sort()
            for _ in arr:
                print(_)
            exit()






