
student=[]
for i in range(28):
    student.append(int(input()))

for j in range(1,31):
    if j not in student:
        print(j)


