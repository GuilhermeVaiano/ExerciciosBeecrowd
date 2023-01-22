# include <stdio.h>
/*
https://www.beecrowd.com.br/judge/pt/problems/view/1021
*/
int main(void) {
	int valor,a,b,c,d,e,f,g;
	scanf("%d", &valor);
	for (a=0; valor>=100; a++) valor -= 100;
	for (b=0; valor>=50; b++) valor -= 50;
	for (c=0; valor>=20; c++) valor -= 20;
	for (d=0; valor>=10; d++) valor -= 10;
	for (e=0; valor>=5; e++) valor -= 5;
	for (f=0; valor>=2; f++) valor -= 2;
	for (g=0; valor>=1; g++) valor -= 1;
	printf("%d", valor);
	printf("%d nota(s) de R$ 100,00\n", a);
	printf("%d nota(s) de R$ 50,00\n", b);
	printf("%d nota(s) de R$ 20,00\n", c);
	printf("%d nota(s) de R$ 10,00\n", d);
	printf("%d nota(s) de R$ 5,00\n", e);
	printf("%d nota(s) de R$ 2,00\n", f);
	printf("%d nota(s) de R$ 1,00\n", g);

	return 0;
}


/* Resposta aceita:
    int notes, aux;

    scanf("%d", &notes);

    printf("%d\n", notes);
    printf("%d nota(s) de R$ 100,00\n", notes/100);
    aux = (notes%100);


    printf("%d nota(s) de R$ 50,00\n", aux/50);
    aux = (aux%50);

    printf("%d nota(s) de R$ 20,00\n", aux/20);                                                                                                                        
    aux = (aux%20);

    printf("%d nota(s) de R$ 10,00\n", aux/10);
    aux = (aux%10);

    printf("%d nota(s) de R$ 5,00\n", aux/5);
    aux = (aux%5);

    printf("%d nota(s) de R$ 2,00\n", aux/2);
    aux = (aux%2);

    printf("%d nota(s) de R$ 1,00\n", aux/1);
*/
