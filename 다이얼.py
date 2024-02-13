s=input()
sum=0
for i in s:
	if i in ["A","B","C"]:
		sum+=3
	elif i in ["D","E","F"]:
		sum+=4
	elif i in ["G","H","I"]:
		sum+=5
	elif i in ["J","K","L"]:
		sum+=6
	elif i in ["M","N","O"]:
		sum+=7
	elif i in ["P","Q","R","S"]:
		sum+=8
	elif i in ["T","U","V"]:
		sum+=9
	elif i in ["W","X","Y","Z"]:
		sum+=10
print(sum)