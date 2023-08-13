package level2;

import java.util.Scanner;

public class Bee2415 {
// https://www.beecrowd.com.br/judge/pt/problems/view/2415
	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		int qtd = Integer.parseInt(read.nextLine());
		
		String[] entrada = read.nextLine().split(" ");
		System.out.println(contaPontos(qtd, entrada));
		read.close();
	}

	
private static int contaPontos(int qtd, String[] entrada) {
	// Verifica o vetor e retorna o tamanho da maior sequencia de numeros iguais
	int pontos = 0;
	int valoresIguais = 1;
	
	for(int i=1; i<qtd; i++) {
		if(entrada[i].equals(entrada[i-1])) {
			valoresIguais++;
			if(valoresIguais >= pontos) pontos = valoresIguais;
			
		} else {
			valoresIguais = 1;
		}
		
	}
	
	return pontos;
	
}

}
