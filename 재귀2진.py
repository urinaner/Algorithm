n = int(input())

def two(n):
    print(n%2)
    two(n//2)

two(n)
