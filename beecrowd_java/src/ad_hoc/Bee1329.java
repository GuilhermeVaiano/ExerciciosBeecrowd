package ad_hoc;

import java.util.Scanner;

public class Bee1329 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1329
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		while(true) {
			int numCasos = read.nextInt();
			read.nextLine();
			if(numCasos == 0) break;
			String[] resultados = new String[numCasos];
			resultados = read.nextLine().split(" ");
			int ptsMary = 0, ptsJohn = 0;
			for(int i=0; i<numCasos; i++) {
				int valor = Integer.parseInt(resultados[i]);
				if (valor == 0) ptsMary++;
				else if (valor == 1) ptsJohn++;
			}
			
			System.out.printf("Mary won %d times and John won %d times\n", ptsMary, ptsJohn);
			read.close();
		}

	}

}
