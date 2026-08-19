t = int(input())
while t > 0:
	n, m = list(map(int, input().split()))
	required_left_shoes = n-m if n-m > 0 else 0
	print(required_left_shoes + n)
	t -= 1