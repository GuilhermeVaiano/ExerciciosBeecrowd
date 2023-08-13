package level4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bee1104 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1104
	public static void main(String[] args) {
		var read = new Scanner(System.in);
		
		while(true) {
			int qtd_cartasA = read.nextInt();
			int qtd_cartasB = read.nextInt();
			if (qtd_cartasA == 0 && qtd_cartasB == 0) break;
			read.nextLine();
			trocar_cartas(qtd_cartasA,qtd_cartasB, read);
		}

	}

	private static void trocar_cartas(int qtd_cartasA, int qtd_cartasB, Scanner read) {
		Set<String> baralhoA = new HashSet<>(Arrays.asList(read.nextLine().split(" "))); // Desconsidera cartas repetidas
		Set<String> baralhoB = new HashSet<>(Arrays.asList(read.nextLine().split(" ")));
	    int qtd_trocasA = possiveisTrocas(baralhoA, baralhoB);
	    int qtd_trocasB = possiveisTrocas(baralhoB, baralhoA);
	   
		System.out.println((qtd_trocasA < qtd_trocasB ? qtd_trocasA : qtd_trocasB));
	}

	private static int possiveisTrocas(Set<String> baralho1, Set<String> baralho2) {
		int qtdTrocas = 0;
		
		for (String idCarta : baralho1) {
			if (!baralho2.contains(idCarta)) {
				qtdTrocas++;
			}
		}
		
		return qtdTrocas;
		
	}

}
