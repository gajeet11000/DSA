n = int(input())
alead = 0
blead = 0
max_lead = 0
leader = 0
for i in range(n):
	a, b = list(map(int, input().split()))
	alead += a
	blead += b
	lead = abs(alead-blead)
	if lead > max_lead:
		max_lead = lead
		leader = 1 if alead>blead else 2

print(leader, max_lead)