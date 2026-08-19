for __ in range(int(input())):
	n, x, y, a, b = list(map(int, input().split()))
	petrol_km_by_1_cost = a/x
	diesel_km_by_1_cost = b/y
	if petrol_km_by_1_cost > diesel_km_by_1_cost:
		print("petrol")
	elif diesel_km_by_1_cost > petrol_km_by_1_cost:
		print("diesel")
	else:
		print("any")

