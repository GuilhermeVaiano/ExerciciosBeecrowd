# include <stdio.h>

// https://www.beecrowd.com.br/judge/pt/problems/view/1009


int main(void) {
	char nome[20];
	double salario,vendas;
	scanf("%s", &nome);
	scanf("%lf", &salario);
	scanf("%lf", &vendas);
	printf("TOTAL = R$ %.2f\n", salario+(vendas*0.15));
	return 0;
}
