import random

B = []														#重複なし４桁のランダム整数を作成
B.append(random.randint(0,9))
while len(B) < 4:
	b = random.randint(0,9)
	if not b in B:
		B.append(b)

A = []														#int型、空白区切りで値を受け取る。
A = list(map(int, input("4つの数字").split()))
print(A)
print(B)

C = []														#判定プログラム ...位置も一致〇、値のみ一致△、外れ×
for j in range(4):
	fc = 0
	if A[j] == B[j]:
		C.append("〇")
		continue
	else:
		for k in range(4):
			if A[k] == B[j]:
				C.append("△")
			else:
				fc = fc + 1
				if fc == 4:
					C.append("×")
print(C)
