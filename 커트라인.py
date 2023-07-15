n, m = map(int, input().split())


k = list(map(int, input().split()))
k.sort(reverse=True)
print(k[m-1])
