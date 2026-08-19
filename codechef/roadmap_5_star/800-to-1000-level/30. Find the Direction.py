for __ in range(int(input())):
	x = int(input())
	directions = ["North", "East", "South", "West"]
	print(directions[x%4])