import math
for __ in range(int(input())):
	x, y, r = list(map(int, input().split()))
	extra_sticks = r//30
	must_eat = x
	total_ate = must_eat + extra_sticks
	per_plate = y
	print(int(math.ceil(total_ate/per_plate)))
