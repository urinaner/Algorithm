import sys
dict={}

n=0
while 1:
    tree = sys.stdin.readline().strip()
    

    if len(dict.keys())>10000 or tree=="" or n>1000000:
        break
    n+=1
    if tree in dict:
        dict[tree]+=1
    else:
        dict[tree]=1


sorted_dict = sorted(dict.items())
for key, value in sorted_dict:
    print(key, '%.4f' %((value / n)*100))
