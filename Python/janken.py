import random

hand = ["グー","チョキ","パー","ゲーム終了"]

print("===じゃんけんをしましょう!===")
while True:
	com = random.randint(0,2)
	for i,desc in enumerate(hand):
		print(i, ":",desc)
	you = int(input("出す手を数値で入力:"))
	if you == 3 : break
	if you < 0 or you> 2:
		print("0から3の間で入力してね")
		continue
	print("---")
	print("自分:",hand[you])
	print("相手:",hand[com])
	print("---")
	
	j = (you - com + 3) % 3
	if j == 0:
		print("あいこ")
	elif j==1:
		print("負け(TOT)")
	else:
		print("勝ち!!")
	input("--")