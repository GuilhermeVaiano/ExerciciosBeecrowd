package ad_hoc;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Bee1129 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1129
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Map<String,String> notas = new HashMap<>();
		notas.put("0", "A");
		notas.put("1", "B");
		notas.put("2", "C");
		notas.put("3", "D");
		notas.put("4", "E");
		
		while(true) {
			int qtdQuestoes = read.nextInt();
			if (qtdQuestoes == 0) break;
			
			for(int i=0; i<qtdQuestoes; i++) {
				int contador = 0;
				String resposta = " ";
				int[] valores = new int[5];
				valores[0] = read.nextInt();
				valores[1] = read.nextInt();
				valores[2] = read.nextInt();
				valores[3] = read.nextInt();
				valores[4] = read.nextInt();
				
				for(int j=0; j<valores.length; j++) {
					if (valores[j] >= 0 && valores[j] <= 127) {
						contador++;
						if (contador > 1) {
							break;
						} else {
							resposta = Integer.toString(j);
						}
					}
				}
				
				if(contador == 1) System.out.println(notas.get(resposta));
				if(contador == 0 || contador > 1) System.out.println("*");
			}
			
		}
		
		read.close();
	}
}
