for __ in range(int(input())):
	x, y, z = list(map(int, input().split()))
	conti = x*y
	no_br = x // 3 + (-1 if x % 3 == 0 else 0)
	with_breaks = conti + no_br*z
	print(with_breaks)

