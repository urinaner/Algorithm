def fuc1(i, sign):
    global cnt
    global k

    if len(sign) == 0: #끝까지 가면 종료
        ans.append(save)
        return True
    
    elif cnt == 0: #초기세팅
        cnt+=1
        save.append(i) #save에 저장
        fuc1(i, sign[1:]) #다음

    elif k[_] == '>':
        if a[i] 


    else:







a = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

k = int(input())

sign = list(input().split())
print(sign)

ans = []


for i in a:
    save = []
    cnt = 0
    fuc1(i, sign)