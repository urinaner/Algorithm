
# n, m = map(int, sys.stdin.readline().split())
# n_list = list(map(int, sys.stdin.readline().split()))

# for i in range(0, m):
#     x, y = map(int, sys.stdin.readline().split())
#     sum=0
#     while x<y:
#         sum=sum + n_list[x-1]+n_list[y-1]
#         x=x+1
#         y=y-1
#     if x==y:
#         sum=sum+n_list[x-1]
#     print(sum)
import sys
N, M = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

sum = 0
prefix_sum = [0]
for i in A:
    sum += i
    prefix_sum.append(sum)

for i in range(M):
    start, end = map(int, sys.stdin.readline().split())
    print(prefix_sum[end] - prefix_sum[start - 1])

