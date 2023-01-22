package recomendacoes;

import java.util.Scanner;

/*
 * João havia lido anteriormente, também na Internet, que o número de pessoas que clicam no segundo link 
 * listado é o dobro de número de pessoas que clicam no terceiro link listado. Nessa leitura, ele também 
 * descobriu que o número de pessoas que clicam no segundo link é a metade do número de pessoas que clicam 
 * no primeiro link.
 */
public class Be2413 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int link3 = read.nextInt();
		int link1 = (link3*2)*2;
		System.out.println(link1);

	}

}
