for __ in range(int(input())):
	rolls = list(map(int, input().split()))
	alice, bob = rolls[:3], rolls[3:]
	alice = sum(alice)-min(alice)
	bob = sum(bob)-min(bob)
	if alice > bob:
		print("alice")
	elif alice < bob:
		print("bob")
	else:
		print("tie")
