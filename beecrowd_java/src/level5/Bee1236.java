package level5;

import java.util.Scanner;

public class Bee1236 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1235
	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		int qtd = Integer.parseInt(read.nextLine());
		
		for(int i=0; i<qtd; i++) {
			String frase = read.nextLine();
			System.out.println(imprimir(frase));
		}
		
		read.close();
	}

private static String imprimir(String frase) {
	int meio = (frase.length()) / 2;
	String parte1 = frase.substring(0,meio);
	String parte2 = frase.substring(meio);
	String impressao = inverte(parte1) + inverte(parte2);
	return impressao;
}

private static String inverte(String parte) {
	int tam = parte.length();
	String aux = "";
	for(int i = (tam-1); i >= 0; i--) {
		aux += parte.charAt(i);
	}
	return aux;
}
}
