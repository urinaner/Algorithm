arr1 = [1,2,3,4,5,6,7,8]
arr2 = [8,7,6,5,4,3,2,1]

arr = list(map(int, input().split()))

cnt1 = 0
cnt2 = 0
for i in range(8):
    if arr[i] == arr1[i]:
        cnt1+=1
    if arr[i] == arr2[i]:
        cnt2+=1

if cnt1==8:
    print("ascending")
elif cnt2 == 8:
    print("descending")
else:
    print("mixed")