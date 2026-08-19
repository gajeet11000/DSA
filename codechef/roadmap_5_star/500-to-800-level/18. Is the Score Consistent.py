t = int(input())

while t>0:
	a, b = map(int, input().split())
	c, d = map(int, input().split())

	if c < a or d < b:
		print("IMPOSSIBLE")
	else:
		print("POSSIBLE")
	t -= 1
