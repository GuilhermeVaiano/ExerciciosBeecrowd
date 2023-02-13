package ad_hoc;

import java.util.Arrays;
import java.util.Scanner;

public class Bee2381 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int vencedor = read.nextInt();
		read.nextLine();
		String[] nomes = new String[n];
		
		for (int i=0; i<n; i++) {
			nomes[i] = read.nextLine();
		}
		
		Arrays.sort(nomes);
		System.out.println(nomes[vencedor-1]);
		
		read.close();
	}

}
