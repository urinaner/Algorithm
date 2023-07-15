
N, M = map(int, input().split())
having_list = list(map(int,input().split(' ')))
how_many_list = list(map(int,input().split(' ')))
result = {}
result_2 = {}

for j in how_many_list:
    result_2[j]=1

for key in having_list: # 6 3 2 10 10 10 -10 -10 
    if key not in result_2:# 딕셔너리에 키가 존재하는지 확인
        continue
    M-=1
    result_2[key]-=1

for i in having_list: # {10:0, 9:0, -5:0, 2:0, 3:0, ... } 
    result[i]=1 #딕셔너리 생성하기


for key in how_many_list: # 6 3 2 10 10 10 -10 -10 
    if key not in result:# 딕셔너리에 키가 존재하는지 확인
        continue
    N-=1
    result[key]-=1
print(N+M)
