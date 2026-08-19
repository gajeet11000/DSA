import math
for __ in range(int(input())):
	x, n = list(map(int, input().split()))
	left = n - x*100
	left = 0 if left < 0 else left
	print(math.ceil(left/100))
