t = int(input())

while t>0:
	x, y = map(int, input().split())
	if y/x * 100 >= 50:
		print("YES")
	else:
		print("NO")
	t-=1