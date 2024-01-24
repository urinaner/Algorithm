import sys

n = int(input())


m_list = list(map(int, input().split()))

m_list1 = m_list

x=0 #축

for i in range(0, n): #n번
    pop=m_list.pop(x)
    print(m_list1.index(pop))