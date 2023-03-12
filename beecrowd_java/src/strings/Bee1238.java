package strings;

import java.util.Scanner;

public class Bee1238 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1238
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtd = Integer.parseInt(read.nextLine());
		
		for(int i=0; i<qtd; i++) {
			String[] str = read.nextLine().split(" ");
			int maiorTam = (str[0].length() > str[1].length() ? str[0].length() : str[1].length());

			StringBuilder strFinal = new StringBuilder();
			strFinal.ensureCapacity(str[0].length()+str[1].length());
			
			for(int j=0; j < maiorTam; j++) {
				if (j  < str[0].length()) {
					strFinal.append(str[0].charAt(j));
				}
				if (j < str[1].length()) {
					strFinal.append(str[1].charAt(j));
				}
			}
			
			System.out.println(strFinal);
		}
		
		read.close();

	}

}
