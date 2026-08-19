t = int(input())
while t>0:
	n, x = map(int, input().split())
	if x % n == 0:
		print("YES")
	else:
		print("NO")
	t -= 1