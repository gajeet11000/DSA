for __ in range(int(input())):
	z, y, a, b, c = list(map(int, input().split()))
	left =  z-y
	print("YES" if a+b+c <= left else "NO")