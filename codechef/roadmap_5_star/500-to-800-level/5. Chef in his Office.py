t = int(input())
while t>0:
	x, y = map(int, input().split())
	total = 4*x + y
	print(total)
	t -= 1