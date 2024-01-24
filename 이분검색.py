n, m = map(int, input().split())
a = list(map(int, input().split()))

a.sort()

start=0
end = n-1
while start <= end:
    mid = (end + start) //2
    if a[mid] == m:
        print(mid+1)
        break
    elif a[mid] <= m:
        start = mid + 1
    else:
        end = mid - 1