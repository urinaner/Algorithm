N = int(input())

def maxProfit(index):
    global N
    global cnt

    money = 0
    if cnt > N:
        return False
    money += maxProfit(index+arr[index][0])
    





arr = []
for i in range(N):
    a, b = map(int, input().split())
    arr.append([a,b])

for i in range(N):
    cnt = 0
    arr.append(maxProfit(0))
