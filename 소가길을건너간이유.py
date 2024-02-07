from collections import deque
n = input()

ans=deque([])
dq = deque([])
for i in range(len(n)): #입력
	dq.append(i)

for _ in range(len(n)):
	cow=dq.popleft()
	if any(cow == x for x in dq) and cow == dq[-1]:
		dq.pop()
	else:
		dq.append(cow)
print(dq)
	
