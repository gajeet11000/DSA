import math
t = int(input())
while t > 0:
	x, y = list(map(int, input().split()))
	print(math.ceil((y-x)/8))
	t -= 1