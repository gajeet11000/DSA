t = int(input())
while t>0:
	x, y, z = map(int, input().split())
	total = x * y
	percent = (z/total) * 100
	if percent > 50:
		print("YES")
	else:
		print("NO")
	t -= 1
