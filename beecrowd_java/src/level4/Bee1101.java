package level4;

import java.util.Scanner;

public class Bee1101 {
	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		while(true) {
			int valor1 = read.nextInt();
			int valor2 = read.nextInt();
			
			if(valor1 <= 0 || valor2 <= 0) {
				break;
			
			} else {
				exibirSoma(valor1,valor2);
			}
		
		}
		read.close();

	}

	private static void exibirSoma(int valor1, int valor2) {
		int soma = 0;
		int maior = Math.max(valor1, valor2);
		int menor = Math.min(valor1, valor2);
		for(int i = menor; i <= maior; i++) {
			soma += i;
			System.out.printf("%d ", i);
		}
		
		System.out.println("Sum=" + soma);
		
	}

}
