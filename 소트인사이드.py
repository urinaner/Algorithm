n = int(input())

list = []
while n:
    list.append(n%10)
    n=int(n/10)
list.sort(reverse=True)
sum = 0
for i in list:
    sum = sum * 10 + i

print(sum)
