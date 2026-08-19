for __ in range(int(input())):
	a, b, m= list(map(int, input().split()))
	if b < a:
		a, b = b, a
	forward = abs(b-a)
	reverse = (a) + (m-b)
	print(min(forward, reverse))
