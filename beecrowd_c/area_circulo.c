# include <stdio.h>
/*
https://www.beecrowd.com.br/judge/pt/problems/view/1002
*/

int main(void) {
	double raio, area;
	double n = 3.14159;
	scanf("%lf", &raio);
	area = n *(raio*raio);
	printf("A= %.4f\n", area);
	return 0;
}
