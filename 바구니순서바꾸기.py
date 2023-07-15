from random import randrange


n, m = map(int, input().split())


list = [i for i in range(1, n+1)]

for _ in range(0,m):
    i, j, k = map(int, input().split()) #b-a 개수를 c뒤로 붙이기
    list = list[:i-1]+ list[k-1:j] + list[i-1:k-1]+list[j:]      

print(*list)  



    
