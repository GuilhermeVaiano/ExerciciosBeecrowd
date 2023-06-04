package level4;

import java.util.Scanner;

public class Bee1169 {

	public static void main(String[] args) {
		var read = new Scanner(System.in);
		int casos = Integer.parseInt(read.nextLine());
		
		for(int i=0; i<casos;i++) {
			int casas = read.nextInt();
			long trigoKg = (long)(Math.pow(2,casas)/12000);
			System.out.println(trigoKg + " kg");
		}
		
		read.close();

	}

}
