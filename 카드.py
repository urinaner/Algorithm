n = int(input())

dic = {}

for i in range(n):
    card = int(input())
    if card in dic:
        dic[card] += 1
    else:
        dic[card] = 1
print(dic)
dic = sorted(dic.items(), key=lambda x: (-x[1],x[0]))
print(dic[0][0])

