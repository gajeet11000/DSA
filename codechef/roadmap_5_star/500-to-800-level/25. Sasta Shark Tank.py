t = int(input())
while t>0:
	a, b = map(int, input().split())
	a = a * 10
	b = b * 5

	if a > b:
		print("FIRST")
	elif b > a:
		print("SECOND")
	else:
		print("ANY")
	t -= 1
