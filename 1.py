import sys

n = str(sys.stdin.readline())

n=n.lower()

cnt_list={}
for i in range(len(n)-1):
    cnt_list[n[i]]=0
for i in range(len(n)-1):
    cnt_list[n[i]]+=1

max_cnt=max(cnt_list.values())
cnt=0
for i in cnt_list.values():
    if i == max_cnt:
        cnt+=1
if cnt>1:
    print("?")
else:
    for k, v in cnt_list.items():
        if v == max_cnt:
            print(k.upper())




