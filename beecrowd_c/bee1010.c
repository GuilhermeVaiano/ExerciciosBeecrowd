# include <stdio.h>
// https://www.beecrowd.com.br/judge/pt/problems/view/1010

int main (void) {
	int cod1,qtd1,cod2,qtd2;
	double preco1,preco2;
	scanf("%d %d %lf",&cod1,&qtd1,&preco1);
	scanf("%d %d %lf",&cod2,&qtd2,&preco2);
	printf("VALOR A PAGAR: R$ %.2f\n", (qtd1*preco1) + (qtd2*preco2));
	return 0;
}
