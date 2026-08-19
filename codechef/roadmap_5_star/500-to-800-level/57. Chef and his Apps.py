for __ in range(int(input())):
	s, *mem, z = list(map(int, input().split()))
	mem.sort(reverse=True)
	total = sum(mem)
	idx = 0
	while total+z>s:
		total -= mem[idx]
		idx += 1
	print(idx)

