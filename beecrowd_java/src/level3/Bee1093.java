package level3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Bee1093 {

	public static void main(String[] args) {
		var read = new Scanner(System.in);
		var local = new Locale("en", "US");
		
		while(true) {
			String[] valores = read.nextLine().split(" ");
			if(Arrays.stream(valores).allMatch(n -> n.equals("0"))) break;
			var jogo = new Jogo(valores);
			System.out.println(String.format(local, "%.1f", jogo.probVitoria()*100.0));
		}
	}

}
	
class Jogo {
	public int hp1;
	public int hp2;
	public int at;
	public int dano;
	
	public Jogo(String [] vals) {
		this.hp1  = Integer.parseInt(vals[0]);
		this.hp2  = Integer.parseInt(vals[1]);
		this.at   = Integer.parseInt(vals[2]);
		this.dano = Integer.parseInt(vals[3]);
	}

	public double probVitoria() {
		double prob;
		if (at == 3) {
			return (double) hp1/ (double) (hp1+hp2);
		} else {
			prob = 1.0 - (double)(6-at)/6.0;
			prob = (1-prob)/prob;
			return (1.0 - Math.pow(prob,hp1))/ (1.0 - Math.pow(prob, hp1+hp2));
		}
	}	
}

