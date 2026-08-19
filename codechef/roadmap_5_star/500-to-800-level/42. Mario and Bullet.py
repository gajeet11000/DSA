t = int(input())
while t > 0:
	x, y, z = list(map(int, input().split()))
	time = y/x
	print(z-time)
	t -= 1