package ad_hoc;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bee1300 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1300
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int cont =0;
		while(cont == 0) {
			try {
				String dist = read.nextLine();
				if (dist == "") break;
				int n = Integer.parseInt(dist);
				System.out.println((n%6 == 0? 'Y' : 'N'));
			} catch (NoSuchElementException e) {
				break;
			}
		}
		read.close();
	}

}





/*

Relogio em 12 partes:
360/12 = 30° a cada hora
Angulo máximo entre hora e minuto (Caso: ponteiro da hora no 12 e do minuto no 6): 180°

*/