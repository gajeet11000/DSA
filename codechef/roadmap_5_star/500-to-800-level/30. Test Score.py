t = int(input())
while t>0:
	n, x, y = map(int, input().split())
	if y <= n*x and y % x == 0:
		print("YES")
	else:
		print("NO")
	t -= 1