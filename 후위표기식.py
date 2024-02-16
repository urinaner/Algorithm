import sys
a = list(input())

stack = []

res = ''
for i in a:
    if i == '(':
        stack.append(i)
    elif i == '*' or i == '/':
        while stack and (stack[-1]=='*' or stack[-1]=='/'):
            res+=stack.pop()
        stack.append(i)
    elif i == '+' or i == '-':
        while stack and stack[-1]!='(':
            res+=stack.pop()
        stack.append(i)
    elif i == ')':
        while stack and stack[-1]!='(':
            res+=stack.pop()
        stack.pop()
    else:
        res+=i
while stack:
    res+=stack.pop()

print(res)


    
