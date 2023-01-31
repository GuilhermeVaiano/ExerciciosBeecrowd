package strings;

import java.util.Scanner;

public class Bee1272 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1272
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtd = read.nextInt();
		read.nextLine();
		
		for (int i = 0; i<qtd; i++) {
			String msg =read.nextLine();
			StringBuilder codigo = new StringBuilder();
			int contador = 0;
			
			if (!msg.isEmpty()) {
				for(int j = 0; j< msg.length()-1; j++) {
					if (codigo.length() == 0 && msg.charAt(0) != ' ') {
						codigo.insert(0, msg.charAt(0));
						contador++;
						continue;
						
					} else if(msg.charAt(j) == ' ' && msg.charAt(j+1) != ' ') {
						codigo.insert(contador, msg.charAt(j+1));
						contador++;
					}
				}
			}
			
			if(codigo.length() == 0) {
				System.out.println(" ");
			} else {
				System.out.println(codigo);
			}
		}
		
		read.close();

	}

}
