n = int(input())

arr = []
for _ in range(n):
    m = int(input())
    arr.append(m)

arr2 = sorted(arr)

a = set([2, 3])

print(arr2[-1])
for i in range(4, arr2[-1]):
    cnt=0
    for j in range(2, i):
        if i % j == 0:
            cnt+=1
    if cnt == 0:
        a.add(i)

a = list(a)
for _ in range(len(arr)):
    ans = 0
    x = 0
    for i in range(len(a)):
        for j in range(len(a)):
            if a[i] == a[j]:
                x=1
            if (a[i]+a[j]) == arr[_]:
                ans+=1
    if x == 1:
        print(ans//2+1)
    else:
        print(ans//2)


    




