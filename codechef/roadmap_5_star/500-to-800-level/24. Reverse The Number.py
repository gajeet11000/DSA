def revnum(n):
	rev_num = 0
	while n > 0:
		rev_num *= 10
		rev_num += n%10
		n  = n // 10
	return rev_num

t = int(input())
while t>0:
	n = int(input())
	print(revnum(n))
	t -= 1

