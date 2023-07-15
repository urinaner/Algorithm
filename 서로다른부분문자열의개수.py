n = input()

result = {}


for i in range(0, len(n)+1):
    for _ in range(0, len(n)):
        result[n[_:+i]]=1
cnt=0
for i in result:
    cnt+=1

print(cnt-1)