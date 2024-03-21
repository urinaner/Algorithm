n, c = map(int ,input().split())

arr = list(map(int, input().split()))

number = []
cnt_list = []
for i in range(n):
    cnt = 0
    if arr[i] not in number:
        number.append(arr[i])
        for j in range(i, n):
            if arr[i] == arr[j]:
                cnt+=1
        cnt_list.append(cnt)


for i in range(len(number)-1):
    for j in range(len(number)-i-1):
        if cnt_list[j] < cnt_list[j+1]:
            tmp = cnt_list[j+1]
            cnt_list[j+1] = cnt_list[j]
            cnt_list[j] = tmp
            
            tmp = number[j+1]
            number[j+1] = number[j]
            number[j] = tmp

for i in range(len(number)):
    for j in range(cnt_list[i]):
        print(number[i], end=" ")