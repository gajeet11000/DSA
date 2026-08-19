t = int(input())
while t>0:
	n, x = map(int, input().split())
	print(min(x, n-x))
	t-=1