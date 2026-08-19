for __ in range(int(input())):
	nums = list(map(int, input().split()))
	lar = secl = float("-inf")
	for n in nums:
		if n > lar:
			secl = lar
			lar = n
		if n > secl and n != lar:
			secl = n

	print(secl)

