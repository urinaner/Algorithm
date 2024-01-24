import imp


import sys
a, b, c = map(int, sys.stdin.readline().split())


import sys
a, b, c = map(int, sys.stdin.readline().split())


a = a % c

if a < c:
    a = a-c

print(a**b % c)
