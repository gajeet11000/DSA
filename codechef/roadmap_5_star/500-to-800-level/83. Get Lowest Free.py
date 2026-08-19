for __ in range(int(input())):
	prices = list(map(int, input().split()))
	print(sum(prices)-min(prices))