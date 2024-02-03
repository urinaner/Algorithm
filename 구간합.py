n, m = map(int, input().split())

x = list(map(int, input().split()))


ans = 0
for i in range(n):
	sum=0
	for j in range(i,n):
		
		if sum < m:
			sum+=x[j]
			if sum == m:
				ans+=1
				break
		else:
			break
print(ans)
			
			
		