for __ in range(int(input())):
	h, cc, ts = list(map(float, input().split()))

	grade = 5

	conditions = [False]*3

	if h > 50:
		conditions[0] = True
	if cc < 0.7:
		conditions[1] = True
	if ts > 5600:
		conditions[2] = True

	if all(conditions):
		print(10)
	elif conditions[0] and conditions[1]:
		print(9)
	elif conditions[1] and conditions[2]:
		print(8)
	elif conditions[0] and conditions[2]:
		print(7)
	elif any(conditions):
		print(6)
	else:
		print(5)

