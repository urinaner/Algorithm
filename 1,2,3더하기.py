def sum123(sum, goal) :
    if (sum > goal) :
        return 0
    if (sum == goal) :
        return 1
    now = 0
    for i in arr :
        now += sum123(sum+i, goal)
    return now;

arr = [1, 2, 3]
n = int(input())
for _ in range(n) :
    a = int(input())
    print(sum123(0, a))