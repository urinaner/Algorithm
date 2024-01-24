n, m = map(int, input().split())

a=[]
for i in range(n):
    a.append(int(input()))


a.sort()

start=1
end = max(a)
max = 0
while start<=end:
    cnt = 0
    mid = (end + start) // 2  #랜선 길이
    for i in a:
        cnt += (i // mid) #순서대로 나눠보기

 

    if cnt >= m:
        start = mid + 1
        
    else:
        end = mid - 1
        

print(end)