t = int(input())
while t>0:
	s = input()
	a = input()
	m = ""
	for t_ch, s_ch in zip(a, s):
		if t_ch == s_ch:
			m += "G"
		else:
			m += "B"
	print(m)
	t -= 1