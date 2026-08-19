import math
for __ in range(int(input())):
	x, y = list(map(int, input().split()))
	print(abs(math.ceil(x/10) - math.ceil(y/10)))
