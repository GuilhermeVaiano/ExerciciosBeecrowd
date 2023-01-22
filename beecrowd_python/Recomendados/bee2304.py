# https://www.beecrowd.com.br/judge/pt/problems/view/2304

n = int(input())
if n == 0:    print("E")
elif n <= 35: print("D")
elif n <= 60: print("C")
elif n <= 85: print("B")
else: print("A")
