n, m = map(int, input().split())

n_list = []
m_list = []
for i in range(0, n):
    tmp = input()
    n_list.append(tmp)

n_list.sort()
for _ in range(0, m):
    tmp = input()
    m_list.append(tmp)


cnt = 0
for j in range(0, m):
    start = 0
    end = len(n_list)-1
    

    while start <= end:
        mid = int((start+end)/2)
        if n_list[mid] == m_list[j]:  
            cnt += 1
            break
        elif n_list[mid] < m_list[j]:
            start = mid + 1
        elif n_list[mid] > m_list[j]:
            end = mid - 1
    
print(cnt)


