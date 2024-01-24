n = int(input())


word=[]
for i in range(n):
    word.append(input())

word_set=list(set(word))

word_sort=[]
for j in word_set:
    word_sort.append((len(j),j))

result = sorted(word_sort)

for len_i, i in result:
    print(i)