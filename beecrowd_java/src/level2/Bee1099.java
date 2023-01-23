package level2;

import java.util.Scanner;

public class Bee1099 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1099
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int casos = read.nextInt();
		for (int i = 0; i<casos; i++) {
			int num1 = read.nextInt();
			int num2 = read.nextInt();
			int menor = Math.min(num1, num2);
			int maior = Math.max(num1, num2);
			System.out.println(calculaImpares(menor,maior));
		}
		read.close();
	}

	public static int calculaImpares(int menor, int maior) {
		int soma = 0;
		for(int i = menor+1; i<maior; i++) {
			if(i%2 == 1) soma += i;
		}
		return soma;
	}
}
