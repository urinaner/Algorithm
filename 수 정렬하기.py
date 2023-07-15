import sys
n = int(input())

m = []
for i in range(0, n):
    i = int(sys.stdin.readline())
    m.append(i)

m.sort()

for i in m:
    print(i)
