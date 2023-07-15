n = int(input())
n_list = list(map(int, input().split()))
m = int(input())
m_list = list(map(int, input().split()))

n_list.sort()



for _ in m_list:
    cnt = 0
    start = 0
    end = len(n_list)-1
    while start <= end:
        mid = int((start+end)/2)
        if n_list[mid] == _:
            cnt=1
            print(1)
            break
        elif n_list[mid] < _:
            start = mid + 1
        elif n_list[mid] > _:
            end = mid - 1

    if cnt == 0:
        print(0)
        
        
