import numbers


n = int(input())

for i in range(0, n):
    number=[]
    sum = 0
    number = list(map(int, input().split()))
    for k in number:
        sum+=k
    sum-=number[0]

    count = 0
    for _ in range(1,number[0]+1):
        if number[_] > sum/number[0]:
            count+=1
    print(f"{count/number[0]*100:.3f}%")


