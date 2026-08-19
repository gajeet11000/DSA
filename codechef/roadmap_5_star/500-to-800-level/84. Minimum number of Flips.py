for __ in range(int(input())):
	n = int(input())
	nums = list(map(int, input().split()))
	if n % 2 != 0:
		print(-1)
	else:
		half = n//2
		ones = 0
		for num in nums:
			if num == 1:
				ones += 1
		minus_ones = n-ones
		print(min(abs(half-ones), abs(half-minus_ones)))

