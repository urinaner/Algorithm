n = int(input())

n_list = list(map(int, input().split()))

m = int(input())

m_list = list(map(int, input().split()))

n_list.sort()
m_list.sort()

cnt = 0
time = 1

j=0

if n_list[-1] < m_list[-1]: #종료조건
    print(-1)
    exit()


for i in m_list:
    cnt+=i
    if cnt <= n_list[j]:
        j+=1
        cnt=0
        if j == n: #한바퀴
            time+=1
            j=0
    else:
        
        for _ in range(j, len(n_list)):
            if cnt <= n_list[_]:
                j=_
                cnt=0
                break
print(time)

        

