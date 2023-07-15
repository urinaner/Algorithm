import sys
n = int(sys.stdin.readline())

card = list(map(int, sys.stdin.readline().split()))

card.sort()
m = int(sys.stdin.readline())

k = list(map(int, sys.stdin.readline().split()))


for i in range(0, m): 
    start = 0
    end = len(card)-1
    mid = 0  
    cnt = 0
    while (start <= end):
        mid = int((start+end)/2)
        if card[mid] == k[i]:
            print("1", end=" ")
            cnt +=1
            break
        elif card[mid] < k[i]:
            start=mid+1
        elif card[mid] > k[i]:
            end=mid-1
    if cnt == 0:
        print("0", end=" ")



