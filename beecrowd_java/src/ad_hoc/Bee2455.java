package ad_hoc;

import java.util.Scanner;

public class Bee2455 {
// https://www.beecrowd.com.br/judge/pt/problems/view/2455
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int p1 = read.nextInt();
		int c1 = read.nextInt();
		int p2 = read.nextInt();
		int c2 = read.nextInt();
		
		if (p1*c1 > p2*c2) {
			System.out.println(-1);
		} else if (p1*c1 < p2*c2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		read.close();
	}

}
