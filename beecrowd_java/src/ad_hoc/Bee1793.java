package ad_hoc;

import java.util.Scanner;

public class Bee1793 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1793
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cont = 0;
		while(cont < 30) {
			int n = scan.nextInt();
			if(n == 0) {
				break;
			} else {
				CalcTempo(n,scan);
			}
			cont++;
		}
		scan.close();
}
	
	public static void CalcTempo(int n, Scanner scan) {
		if (n == 1) {
			System.out.println("10");
			
		} else {
			int[] t = new int[n];
			for(int i = 0; i<n; i++) {
				t[i] = scan.nextInt();
			}
			int tempoAtiva = 10;
			for(int j = 0; j<n-1; j++) {
				int diff = t[j+1] - t[j];
				if(diff > 10) {
					tempoAtiva += 10;
				} else {
					tempoAtiva += diff;
				}
			}
			System.out.printf("%d\n", tempoAtiva);
			scan.nextLine();
		}
	}
}
