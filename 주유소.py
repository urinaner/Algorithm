import sys
input = sys.stdin.readline

n = int(input())

n_list = list(map(int, input().split()))

m_list = list(map(int, input().split()))

cost = [0] * (n)
print(cost)
total = 0
# for i in range(m_list):
#     for j in range(n_list):
