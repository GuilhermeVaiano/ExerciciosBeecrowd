package level5;

import java.util.Scanner;

public class Bee1031 {

	public static void main(String[] args) {
		var read = new Scanner(System.in);
		
		while(true) {
			int num_regioes = Integer.parseInt(read.nextLine());
			if(num_regioes == 0) break;
			
			int valor_salto = 1;
			while ((josephus(num_regioes - 1, valor_salto) + 12) % num_regioes !=0) {
				valor_salto++;
			}
			System.out.println(valor_salto);   
			
		}
			
		read.close();
	}

	private static int josephus(int n, int valor_salto) {
		if (n == 1) {
			return 0;
		} else {
			return (josephus(n-1,valor_salto) + valor_salto) % n;
		}
	}

}
