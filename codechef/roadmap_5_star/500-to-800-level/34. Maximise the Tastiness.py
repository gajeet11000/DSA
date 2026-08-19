t = int(input())
while t>0:
	a, b, c, d = map(int, input().split())
	print(max(a, b) + max(c, d))
	t -=1 
