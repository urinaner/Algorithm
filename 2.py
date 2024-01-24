import sys
a=sys.stdin.readline().strip()
a=a.lower()
list_a=[0 for i in range(len(a))]
print(list_a)
for i in range(0,len(list_a)-1):
    cnt=0
    print(i)
    for k in range(i+1,len(list_a)):
        print(k)
        if a[i]==a[k]:
            cnt+=1
    list_a[i]=cnt

print(list_a)