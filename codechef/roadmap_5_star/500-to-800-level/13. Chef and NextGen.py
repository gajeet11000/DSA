t = int(input())
while t>0:
	a, b, x, y = map(int, input().split())
	total_energy = x * y
	years = total_energy//a
	if years >= b:
		print("YES")
	else:
		print("NO")
	t -= 1