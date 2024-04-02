n, k = map(int, input().split())

arr = [1] * (n+1)
cnt = 0

for i in range(2, n+1):
    if arr[i] == 1: #아직 안지웠으면
        for j in range(i, n+1, i):
            if arr[j] == 1:
                cnt+=1
            
            if cnt == k:
                print(j)
                break
            arr[j]+=1 #i씩 증가시키면서 지운다.



