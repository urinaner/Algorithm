import sys
n = int(sys.stdin.readline())
k=n
m=n


if n == 2:
    print(1)
    sys.exit(0)

tmp_n=0
res_cnt1=0
res_cnt2=0
tmp_m=0
while k>1:
    cnt_1=0
    cnt_2=0
    n=k
    while n>=3: #3의 몇승인지
        n //= 3
        cnt_1+=1

    print(cnt_1)
    while m>=2: #2의 몇승인지
        m //= 2
        cnt_2+=1
         
    print(cnt_2)
    k_min=min(k-3**cnt_1,k-2**cnt_2)
    res_cnt1+=cnt_1
    res_cnt2+=cnt_2
    print(k_min)
    if k_min == 1:
        if k-3**res_cnt1==k_min:
            print(res_cnt1+1)
        else:
            print(res_cnt2+1)
    k=k_min
        

    

