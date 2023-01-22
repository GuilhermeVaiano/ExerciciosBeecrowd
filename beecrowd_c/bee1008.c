# include <stdio.h>

/* Escreva um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por hora 
e calcula o salário desse funcionário. A seguir, mostre o 
número e o salário do funcionário, com duas casas 
decimais.
*/

int main(void) {
	int f_num,hrs_t;
	float valor_hrs;
	scanf("%d", &f_num);
	scanf("%d", &hrs_t);
	scanf("%f", &valor_hrs);
	printf("NUMBER = %d\n", f_num);
	printf("SALARY = U$ %.2f\n", valor_hrs*hrs_t);
	return 0;
}
