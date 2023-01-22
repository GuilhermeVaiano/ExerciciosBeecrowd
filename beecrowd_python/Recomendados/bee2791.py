# https://www.beecrowd.com.br/judge/pt/problems/view/2791
while True:
    n = input()
    v = n.split(' ')
    if len(v) == 4:
        break

for i in range(len(v)):
    if v[i] == "1":
        print(i + 1)
        break
