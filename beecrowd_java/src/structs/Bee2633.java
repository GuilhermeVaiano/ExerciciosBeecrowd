package structs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bee2633 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		while(read.hasNextLine()) {
			int numDeCarnes = Integer.parseInt(read.nextLine());
			Map<String,Integer> listaDeCarnes = preencherLista(numDeCarnes,read);
			exibirPorDataDeValidade(listaDeCarnes);
			System.out.println();
		}

		read.close();
	}

	private static void exibirPorDataDeValidade(Map<String, Integer> listaDeCarnes) {
		List<Map.Entry<String, Integer>> listaDeCarnesOrdenada = new ArrayList<>(listaDeCarnes.entrySet());
		Collections.sort(listaDeCarnesOrdenada, Map.Entry.comparingByValue());
		
		for(Map.Entry<String, Integer> entry : listaDeCarnesOrdenada) {
			System.out.printf("%s ", entry.getKey());
		}
		
	}

	private static Map<String, Integer> preencherLista(int numDeCarnes, Scanner read) {
		Map<String,Integer> listaDeCarnes = new HashMap<>();
		for(int i=0; i<numDeCarnes; i++) {
			String[] entradas = read.nextLine().split(" ");
			listaDeCarnes.put(entradas[0],Integer.parseInt(entradas[1]));
		}
		
		return listaDeCarnes;
	}

}
