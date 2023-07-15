from random import randrange


k = int(input())

numbers = []
for i in range(0, k):
    n = int(input())
    if n !=0:
        numbers.append(n)
    else:
        numbers.pop()

sum = 0
for i in numbers:
    sum +=i

print(sum)
        