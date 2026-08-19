import math
t = int(input())
while t>0:
	n, x = map(int, input().split())

	total_slices = n * x
	pizzas = math.ceil(total_slices/4)
	print(pizzas)
	t -= 1
