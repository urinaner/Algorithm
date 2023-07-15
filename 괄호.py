n = int(input())


for i in range(0, n):
    m = input()

    criteria = 0

    for j in m:
        if criteria<0 :
            break
        if j == '(':
            criteria+=1
        elif j == ')':
            criteria-=1
    
    if criteria == 0:
        print("YES")
    else:
        print("NO")
            
    
        



