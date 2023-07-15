x, y, w, h = map(int, input().split())
w_min = 0
h_min = 0
if (w - x)*(w - x) > x * x:
    w_min = x
else:
    w_min = w-x

if (h - y)*(h - y) > y * y:
    h_min = y
else:
    h_min = h-y

if w_min > h_min:
    print(h_min)
else:
    print(w_min)
