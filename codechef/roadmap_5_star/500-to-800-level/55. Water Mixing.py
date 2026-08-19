for __ in range(int(input())):
	a, b, x, y = list(map(int, input().split()))
	if b > a + x or b < a - y:
		print("No")
	else:
		print("Yes")
