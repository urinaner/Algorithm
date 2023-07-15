# import sys
# n = int(sys.stdin.readline())

# card = list(map(int, sys.stdin.readline().split()))

# card.sort()
# m = int(sys.stdin.readline())

# k = list(map(int, sys.stdin.readline().split()))


# for i in range(0, m): 
#     start = 0
#     end = len(card)-1
#     mid = 0  
#     cnt = 0
#     while (start <= end):
#         mid = int((start+end)/2)
#         if card[mid] == k[i]:
#             for _ in card:
#                 if _ == k[i]:
#                     cnt +=1
#             break
#         elif card[mid] < k[i]:
#             start=mid+1
#         elif card[mid] > k[i]:
#             end=mid-1
#     if cnt == 0:
#         print("0", end=" ")
#     else:
#         print(cnt, end=" ")

N = int(input())
having_list = list(map(int,input().split(' ')))
M = int(input())
how_many_list = list(map(int,input().split(' ')))
result = {}

for i in how_many_list: # {10:0, 9:0, -5:0, 2:0, 3:0, ... } 
    result[i]=0 #딕셔너리 생성하기
for key in having_list: # 6 3 2 10 10 10 -10 -10 
    if key not in result:# 딕셔너리에 키가 존재하는지 확인
        continue
    result[key]+=1
print(result)


for i in how_many_list:
    print(result[i], end=' ')
