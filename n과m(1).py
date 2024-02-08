def func1():
    if m == len(arr):
        print(" ".join(map(str , arr)))
        return
    for i in range(1, n+1):
        if i not in  arr:
            arr.append(i)
            func1()
            arr.pop()
    
arr = []
n, m  = map(int, input().split())
func1()