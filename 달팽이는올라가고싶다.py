a,b,v = map(int, input().split())

if (v-b)%(a-b)!=0:
    print(int((v-b)/(a-b)+1))
else:
    print(int((v-b)/(a-b)))
