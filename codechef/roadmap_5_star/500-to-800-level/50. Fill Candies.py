import math
for __ in range(int(input())):
	n, k, m = list(map(int, input().split()))
	print(math.ceil(n / (k * m)))

