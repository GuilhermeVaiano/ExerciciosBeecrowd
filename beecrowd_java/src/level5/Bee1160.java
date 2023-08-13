package level5;

import java.util.Scanner;

public class Bee1160 {
	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		int numCasos = Integer.parseInt(read.nextLine());
		
		for (int i=0; i<numCasos; i++) {
			String[] entrada = read.nextLine().split(" ");
			var pop = new Populacao(entrada);
			System.out.println(pop.calcCrescimento());
		}
		
		read.close();
		
	}

}


class Populacao {
	private int cidadeA;
	private double taxaA;
	private int cidadeB;
	private double taxaB;
	
	public Populacao(String[] entrada) {
		cidadeA = Integer.parseInt(entrada[0]);
		cidadeB = Integer.parseInt(entrada[1]);
		taxaA = Double.parseDouble(entrada[2])/100;
		taxaB = Double.parseDouble(entrada[3])/100;
	}

	public String calcCrescimento() {
		int crescPopA = cidadeA;
		int crescPopB = cidadeB;
		int tempoAnos = 0;
		while(crescPopA <= crescPopB) {
			crescPopA = (int) Math.floor(crescPopA + (crescPopA * taxaA));
			crescPopB = (int) Math.floor(crescPopB + (crescPopB * taxaB));
			tempoAnos++;
			if(tempoAnos > 100) return "Mais de 1 seculo.";

		}
		String tempo = tempoAnos + " anos.";
		return tempo;
	}
}
