t = int(input())
while t>0:
	a, b, c = map(int, input().split())
	mx = max(a, c)
	if mx <= b:
		print("YES")
	else:
		print("NO")
	t -= 1