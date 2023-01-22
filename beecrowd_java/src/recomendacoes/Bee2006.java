package recomendacoes;

import java.util.Scanner;

public class Bee2006 {
// https://www.beecrowd.com.br/judge/pt/problems/view/2006
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int tipo_cha = read.nextInt();
		read.nextLine();
		String[] palpites = new String[5];
		palpites = read.nextLine().split(" ");
		int acertos = 0;
		for (int i=0; i<5; i++) {
			if (Integer.toString(tipo_cha).equals(palpites[i])) acertos++;
		}
		System.out.println(acertos);
	}

}
