package ad_hoc;

import java.util.Scanner;

public class Bee1379 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1379
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a,b;
		while(true) {
			a = read.nextInt();
			b = read.nextInt();
			if (a == 0 && b == 0) break;
			System.out.printf("%d\n",(3*a) - (a+b));
		}
		read.close();
	}
}
