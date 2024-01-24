n = int(input())

word={}

for i in range(n):
    word[input()]=i

word.sort()

for i in word:
    print(i)