
n = int(input())

n_list= (n+1) * [0]
n_list[0] = 1
n_list[1] = 10
n_list[2] = 55
n_list[3] = 220

def makenum(n):
    


for i in range(n+1):
    if n_list[i] != 0: #처리
        print(n_list[i])
    else:
        total=0
        x=n_list[i]
        while x!=1:
            total+=n_list[i-1]-n_list[i-2]



