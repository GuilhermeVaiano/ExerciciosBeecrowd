package level2;

import java.util.Scanner;

/* Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a 
 * soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for 
 * par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
 */
public class Bee1035 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		int c = read.nextInt();
		int d = read.nextInt();
		System.out.println(((a%2==0) && (c>0) && (d>0) && (c+d > a+b) && (b>c) && (d>a) ) ? "Valores aceitos" : "Valores nao aceitos");
	}	
}
