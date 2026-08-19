for __ in range(int(input())):
	a, b, x, y = list(map(int, input().split()))
	cheft = a/x
	finat = b/y
	if cheft < finat:
		print("chef")
	elif finat < cheft:
		print('chefina')
	else:
		print("both")
