n, k = map(int, input().split())

parent = 1
for _ in range(1, n+1):
    parent *= _

child1 = 1
for _ in range(1, n-k+1):
    child1 *= _

child2 = 1
for _ in range(1, k+1):
    child2 *= _

print(parent//child1//child2)