a = int(input())
m_list = list(map(int, input().split()))
m_list.sort()
print(m_list[0]*m_list[a-1])