# from ast import Delete

# import sys

# n = int(sys.stdin.readline())


# name =[]
# for i in range(0, n):
#     m, j = map(str, sys.stdin.readline().split())
#     if j == 'enter': #name리스트에 추가하기
#         name.append(m)
#     elif j == 'leave':
#         name.sort(reverse=True)
#         start = 0
#         end = len(name)-1
#         while start <= end:
#             mid = int((start + end)/2)
#             if name[mid] == m:
#                 del name[mid]
#                 break
#             elif name[mid] < m:
#                 start = mid + 1
#             elif name[mid] > m:
#                 end = mid - 1
# for _ in name:
#     print(_)
from sys import stdin
n = int(stdin.readline()) # 회사 출입 기록
worklist = dict() # 회사에서 일하고 있는 사람
for _ in range(n):
    name, work = stdin.readline().strip().split()
    if work == "enter":
        worklist[name] = 1
    else :
        worklist[name] = 0    

print(worklist)
working = sorted(worklist.items(), key= lambda x : x[0], reverse = True)
print(working)
for nme, status in working:
    if status:
        print(nme)