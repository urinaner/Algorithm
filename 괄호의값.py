s = input()
stack = []

ans = 0
x=0
y=0
for c in s:
        if c == "(":
            stack.append(c)
        elif c == "[":
             stack.append(c)
        else:
            if stack: #차있으면
                if c == ")": # )일때
                    ans+=2
                    stack.pop()
                     
                else:
                    ans+=3 # ]일때
                    stack.pop()
                    
            else: #비어있는데 들어오면 0출력
                 print(0)
                 exit()
                       
if stack:
     print(0)
else:
     print(ans)