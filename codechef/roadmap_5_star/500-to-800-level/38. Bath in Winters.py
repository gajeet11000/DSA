t = int(input())
while t > 0:
	x, y = list(map(int, input().split()))
	print((x//y)//2)
	t -= 1