n = input()


cnt=0
max=0
mul=0
max_index=0
for i in range(0, len(n)):
    for j in range(0, len(n)):
        cnt = 0
        if n[i] == n[j]:
            cnt+=1
        elif n[i] ==n[j]+'A':
            cnt+=1
        elif n[i] ==n[j]-'A':
            cnt+=1

    if max<=cnt:
        if max==cnt:
            mul=1
        if max==cnt:
            mul=1
        max=cnt
        max_index=i
        


