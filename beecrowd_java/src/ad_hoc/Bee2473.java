package ad_hoc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee2473 {
//https://www.beecrowd.com.br/judge/pt/problems/view/2473
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String[] entrada = read.nextLine().split(" ");
		
		List<Integer> aposta = new ArrayList<>();
		for(int i=0; i<6; i++) {
			aposta.add(Integer.parseInt(entrada[i]));
		}

		entrada = read.nextLine().split(" ");
		List<Integer> sorteio = new ArrayList<>();
		for(int i=0; i<6; i++) {
			sorteio.add(Integer.parseInt(entrada[i]));
		}
		
		int acertos = 0;
		for(int j=0; j<6; j++) {
			int verificacao = aposta.get(j);
			if (sorteio.contains(verificacao)) acertos++;
		}
		
		if(acertos == 3) System.out.println("terno"); 
		else if(acertos == 4) System.out.println("quadra"); 
		else if(acertos == 5) System.out.println("quina"); 
		else if(acertos == 6) System.out.println("sena"); 
		else System.out.println("azar");
		
		read.close();
	}

}
