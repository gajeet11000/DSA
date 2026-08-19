n = int(input())
sena = list(map(int, input().split()))

lucky = 0

for i in sena:
	if i % 2 == 0:
		lucky += 1
unlucky = len(sena) - lucky
if lucky > unlucky:
	print("READY FOR BATTLE")
else:
	print("NOT READY")
