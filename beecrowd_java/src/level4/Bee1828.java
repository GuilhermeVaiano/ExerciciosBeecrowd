package level4;

import java.util.Scanner;

public class Bee1828 {

	public static void main(String[] args) {
		var read = new Scanner(System.in);
		int qtdJogos = Integer.parseInt(read.nextLine());
		
		for(int i=1; i<=qtdJogos; i++) {
			String entradas = read.nextLine();
			String[] jogo = entradas.split(" ");
			
			if(jogo[0].equals(jogo[1])) {
				System.out.println("Caso #"+i+": De novo!");
			
			} else {
				if (vitoria(jogo)) {
					System.out.println("Caso #"+i+": Bazinga!");
				} else {
					System.out.println("Caso #"+i+": Raj trapaceou!");
				}
				
			}
			
		}
		read.close();
	}

	private static boolean vitoria(String[] jogo) {
		boolean sheldonVenceu = true;
		switch(jogo[0]) {
			case "tesoura":
				if(jogo[1].equals("pedra") || jogo[1].equals("Spock")) {
					sheldonVenceu = false;
				}
				break;
				
			case "papel":
				if(jogo[1].equals("tesoura") || jogo[1].equals("lagarto")) {
					sheldonVenceu = false;
				}
				break;
			
			case "pedra":
				if(jogo[1].equals("papel") || jogo[1].equals("Spock")) {
					sheldonVenceu = false;
				}
				break;
			
			case "lagarto":
				if(jogo[1].equals("tesoura") || jogo[1].equals("pedra")) {
					sheldonVenceu = false;
				}
				break;
			
			case "Spock":
				if(jogo[1].equals("papel") || jogo[1].equals("lagarto")) {
					sheldonVenceu = false;
				}
				break;
		
		}
		return sheldonVenceu;
	}

}
