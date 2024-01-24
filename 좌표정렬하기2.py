import sys

n = int(sys.stdin.readline()) #N
list = []
for i in range(0, n):
    x,y = map(int, input().split())
    list.append([x,y])
    
    print(list)

list.sort(key=lambda x:x[1])
print(list)