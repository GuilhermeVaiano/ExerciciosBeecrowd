# https://www.beecrowd.com.br/judge/pt/problems/view/3048
n = int(input())
contador = 1
i = 1
aux = 1
v =[]
for i in range(n):
    v.insert(i,int(input()))
    if (aux != v[i]):
        aux = v[i]
        contador += 1   
print(contador)
