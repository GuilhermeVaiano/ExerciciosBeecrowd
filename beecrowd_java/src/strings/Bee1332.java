package strings;

import java.util.Scanner;

public class Bee1332 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1332
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtd = read.nextInt();
		String palavra = new String();
		read.nextLine();
		
		for(int i =0; i<qtd; i++) {
			palavra = read.nextLine();
			if(palavra.length() == 3) {
				System.out.println(oneOrTwo(palavra));
			} else {
				System.out.println(3);
			}
		}
		read.close();

	}


private static int oneOrTwo(String palavra) {
	String one  = "one";
	int contador = 0;
	for(int i=0; i<3; i++) {
		if (palavra.charAt(i) == one.charAt(i))	contador++;
		if (contador == 2) return 1;
	}
	
	return 2;
	
}


}