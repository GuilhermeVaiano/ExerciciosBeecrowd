package level6;

import java.util.Locale;
import java.util.Scanner;

public class Bee1021 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);
		double n = read.nextDouble();
		exibeNotas(n);
	}

	private static void exibeNotas(double n) {
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n", (int)(n/100));
		n %= 100;
		System.out.printf("%d nota(s) de R$ 50.00\n", (int)(n/50));
		n %= 50;
		System.out.printf("%d nota(s) de R$ 20.00\n", (int)(n/20));
		n %= 20;
		System.out.printf("%d nota(s) de R$ 10.00\n", (int)(n/10));
		n %= 10;
		System.out.printf("%d nota(s) de R$ 5.00\n", (int)(n/5));
		n %= 5;
		System.out.printf("%d nota(s) de R$ 2.00\n", (int)(n/2));
		n %= 2;
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n", (int)(n/1));
		n %= 1;
		System.out.printf("%d moeda(s) de R$ 0.50\n", (int)(n/0.50));
		n %= 0.50;
		System.out.printf("%d moeda(s) de R$ 0.25\n", (int)(n/0.25));
		n %= 0.25;
		System.out.printf("%d moeda(s) de R$ 0.10\n", (int)(n/0.10));
		n %= 0.10;
		System.out.printf("%d moeda(s) de R$ 0.05\n", (int)(n/0.05));
		n %= 0.05;
		System.out.printf("%d moeda(s) de R$ 0.01", (int)(n/0.01));
		n %= 0.01;
		
		
	}

}
