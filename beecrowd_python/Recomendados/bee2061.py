// https://www.beecrowd.com.br/judge/pt/problems/view/2061

abas, n = (input().split(" "))
abas, n = int(abas), int(n)
for i in range(n):
    acao = input()
    if (acao == "fechou"): abas += 1
    if (acao == "clicou"): abas -= 1
print(abas)
