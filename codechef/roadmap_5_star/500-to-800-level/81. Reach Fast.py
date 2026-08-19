import math
for __ in range(int(input())):
	a, b, k = list(map(int, input().split()))
	diff = abs(a-b)
	print(math.ceil(diff/k))
