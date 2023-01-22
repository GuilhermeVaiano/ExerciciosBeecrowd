# https://www.beecrowd.com.br/judge/pt/problems/view/1153

def fat(n):
    if n == 0: return 1
    return n *fat(n-1)

n = int(input())
print(fat(n))
