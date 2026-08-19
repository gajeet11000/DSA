import math
for __ in range(int(input())):
	h, x, y = list(map(int, input().split()))
	after_special_attack = h-y
	attacks = 1
	if after_special_attack > 0:
		attacks += math.ceil(after_special_attack/x)
	print(attacks)
