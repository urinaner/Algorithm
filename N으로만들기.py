import sys

n = sys.stdin.readline()  #N

answer=1
i=1
n_len=len(n)
while 1:
    if n[i]=='\n':
        break

    if n[i]==n[i-1] and n[i]==n[i+1]:
        i+=1
        continue
    answer*=2
    i+=1

print(int(answer/2+2))


