import sys
arr = [0,1,2,3,4,5,6,7,8,9]
N_init = int(input())
N = list(map(int,str(N_init)))


M = int(input())
del_list = list(map(int, input().split()))

if N_init == 100:
    print(0)
    sys.exit(0)
for i in del_list:
    if i in arr:
        arr.remove(i)

sum = 0


for i in range(len(N)):
    min = 99
    for j in range(len(arr)):
        if min > abs(N[i]-arr[j]):
            min = abs(N[i]-arr[j])
            minIndex = j
    sum+=arr[minIndex]
    sum*=10

print(len(N)+abs((sum//10)-N_init))


