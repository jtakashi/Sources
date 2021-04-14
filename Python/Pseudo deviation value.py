#Pseudo deviation value =「疑似偏差値」

num =[0]
num[0] = 50
 
for i in range(5):
	forprint=[]					          #print用の空配列、ループの初めで毎回初期化(前回printした内容は捨てる。)
	
	for j in num:				          #python 独特の書き方、javaでかくなら for(int j=0; j < num.length; j++)
		left = j - 2			          #同上、「j」 はjavaで考えると「 num[j] 」
		right = j + 3			          #-2した値と+3した値を一時的な配列に追加
		forprint.append(left)	
		forprint.append(right)	    #配列を配列に追加
                                #ループの先頭に戻る
	print(forprint)
	num = forprint
