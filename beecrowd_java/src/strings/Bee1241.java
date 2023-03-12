package strings;

import java.util.Scanner;

public class Bee1241 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1241
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtd = Integer.parseInt(read.nextLine());
		
		for(int i=0; i<qtd; i++) {
			String[] dados = read.nextLine().split(" ");
			boolean isValid = true;
			
			if(dados[0].length() < dados[1].length()) {
				isValid = false;
				
			} else {
				for(int j=0; j < dados[1].length(); j++) {
					if(dados[0].charAt((dados[0].length()-1)-j) != dados[1].charAt((dados[1].length()-1)-j)) {
						isValid = false;
						break;
					}
				}
			
			}
			
			if(isValid) {
				System.out.println("encaixa");
			} else {
				System.out.println("nao encaixa");
			}
			
			
		}
		
		read.close();

	}

}
