package level4;

import java.util.Scanner;

public class Bee1847 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1847	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		int[] temperaturas = new int[3];
		String[] entradas = read.nextLine().split(" ");
		
		for (int i=0; i<3; i++) {
			temperaturas[i] = Integer.parseInt(entradas[i]);
		}
		
		System.out.println(analiseTemperatura(temperaturas));
		read.close();
	}

		private static String analiseTemperatura(int[] temperaturas) {
			int varTemp1 = temperaturas[1] - temperaturas[0];
			int varTemp2 = temperaturas[2] - temperaturas[1];
			String humor = ":)";
			
			if(varTemp1 < 0) {
				if(varTemp2 < varTemp1) humor = ":(";
				if(varTemp2 < 0 && varTemp2 == varTemp1) humor = ":(";
				
			} else if(varTemp1 > 0) {
				if(varTemp2 < 0 && varTemp2 == varTemp1) humor = ":(";
				if(varTemp2 < varTemp1) humor = ":(";
			
			} else if(varTemp1 ==0) {
				if(varTemp2 <= 0) humor = ":(";
			}
			
			return humor;
			
		}

}


/*
1p2 desceu, 2p3 subiu ou permaneceu: =)
1p2 desceu, 2p3 desceu menos: =)
1p2 desceu, 2p3 desceu igual ou mais: =(

1p2 subiu, 2p3 desceu ou permaneceu: =(
1p2 subiu, 2p3 subiu menos: =(
1p2 subiu, 2p3 subiu igual ou mais: =)

1p2 constante, 2p3 subiu: =)
1p2 constante, 2p3 desceu: =(
*/