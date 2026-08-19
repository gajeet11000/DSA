for __ in range(int(input())):
	n, x = list(map(int, input().split()))
	money = n*x - ((n//3)*x)
	print(money)
