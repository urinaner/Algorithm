def hasWord(x, y, word, arr):
    if len(word) == 1:
        return True
    elif x < 0 or x >= 5 or y < 0 or y >=5:
        return False
    elif arr[x][y] != word[0]:
        return False
    
    elif len(word) == 1 :
        return True
        
    for i in range(8):
        nx = x + x_list[i]
        ny = y + y_list[i]
        
        if hasWord(nx,ny, word[1:],arr):
            return True
        
    return False
    

x_list = [1, 1, 1, -1, -1, -1, 0, 0]
y_list = [-1, 0, 1, 1, 0, -1, 1, -1]

arr = [] 

for i in range(5):
    arr.append(input()) #배열 입력


word = input() #단어 입력

for i in range(5): 
    for j in range(5): #전부 탐색
        if(hasWord(i,j,word, arr)): #있으면 출력하고 종료
            print(word,end=" ")
            print("Yes")
            exit()
print(word,end=" ")
print("NO")
        

