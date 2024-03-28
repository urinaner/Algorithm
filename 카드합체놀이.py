n, m = map(int, input().split())
arr = list(map(int, input().split()))

for i in range(m):
    arr.sort()
    game = arr[0] + arr[1]
    arr[0] = game
    arr[1] = game

print(sum(arr))