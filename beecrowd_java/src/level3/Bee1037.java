package level3;

import java.util.Locale;
import java.util.Scanner;

public class Bee1037 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1037
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in).useLocale(Locale.US);
		
		Intervalo[] val = new Intervalo[4];
		val[0] = new Intervalo(0,25);
		val[1] = new Intervalo(25,50);
		val[2] = new Intervalo(50,75);
		val[3] = new Intervalo(75,100);
		
		float n = read.nextFloat();
		if(n < 0 || n>100.0) {
			System.out.println("Fora de intervalo\n");
		} else {
			for(int i=0; i<4; i++) {
				if(val[i].isBelong(n)) {
					System.out.printf("Intervalo %s\n", val[i].formataIntervalo());
					break;
				}
			}
		}
		read.close();
	}

}

class Intervalo {
	private int min;
	private int max;
	
	public Intervalo(int min, int max) {
		this.min = min;
		this.max = max;
	}
	
	public boolean isBelong(float n) {
		if ((n >= this.min && n <= this.max)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String formataIntervalo() {
		return min == 0 ? "[0,25]": String.format("(%d,%d]", min, max);
			
	}
}
