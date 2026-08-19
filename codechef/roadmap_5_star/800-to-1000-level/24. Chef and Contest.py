for __ in range(int(input())):
	x, y, p, q = list(map(int, input().split()))
	chef = p*10 + x
	chefina = q*10 + y
	if chef < chefina:
		print("chef")
	elif chefina < chef:
		print("chefina")
	else:
		print("draw")