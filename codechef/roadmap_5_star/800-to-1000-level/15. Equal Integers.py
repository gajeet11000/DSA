import math
for __ in range(int(input())):
	x, y = list(map(int, input().split()))
	if x < y :
		print(y-x)
	else:	

		diff = ori_diff = x-y
		diff += diff%2

		print(diff//2 + ori_diff%2)
