package ad_hoc;

import java.util.Scanner;

public class Bee2342 {
// https://www.beecrowd.com.br/judge/pt/problems/view/2342
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int limite = read.nextInt();
		read.nextLine();
		String[] calculo = read.nextLine().split(" ");
		int num1 = Integer.parseInt(calculo[0]);
		int num2 = Integer.parseInt(calculo[2]);
		int resultado = 0;
		
		switch(calculo[1]) {
			case "+": resultado = num1 + num2; break;
			case "*": resultado = num1 * num2; break;
		}
		
		System.out.println((limite >= resultado? "OK" : "OVERFLOW"));
		read.close();
	}

}
