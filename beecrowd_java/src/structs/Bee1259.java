package structs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bee1259 {

	public static void main(String[] args) {
		int[] entradas = lerEntradas();
		dividirVetor(entradas);

	}


	private static void dividirVetor(int[] entradas) {
		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();
		
		for(int num : entradas) {
			
			if (num % 2 == 0) {
				pares.add(num);
			} else {
				impares.add(num);
			}
		}
		
		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());
		exibirVetor(pares);
		exibirVetor(impares);
		
	}


	private static void exibirVetor(ArrayList<Integer> vetor) {
		for(int num : vetor) {
			System.out.println(num);
		}
		
	}


	private static int[] lerEntradas() {
		Scanner read = new Scanner(System.in);
		int qtd = Integer.parseInt(read.nextLine());
		int[] numeros = new int[qtd];
		
		for (int i=0; i<qtd; i++) {
			numeros[i] = Integer.parseInt(read.nextLine());
		}
		return numeros;
	}

}
