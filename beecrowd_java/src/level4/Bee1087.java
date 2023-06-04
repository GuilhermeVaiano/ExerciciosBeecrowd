package level4;

import java.util.Scanner;

public class Bee1087 {

	public static void main(String[] args) {
		var read = new Scanner(System.in);
		while(true) {
			String[] entradas = read.nextLine().split(" ");
			if(entradas[0].equals("0") && entradas[1].equals("0") && entradas[2].equals("0") && entradas[3].equals("0")) break;
			
			int[] posicoes = new int[4];
			for(int i=0; i<posicoes.length; i++) {
				posicoes[i] = Integer.parseInt(entradas[i]);
			}
			
			System.out.println(qtdMovimentos(posicoes));
		}
		
		read.close();
	}

	private static int qtdMovimentos(int[] coord) {
		if((coord[0] == coord[2]) && (coord[1] == coord[3])) { 
			return 0;
		
		} else if ((coord[0] == coord[2]) || (coord[1] == coord[3])) {
			return 1;
			
		} else if ( (Math.abs(coord[0] - coord[2])) == (Math.abs(coord[1] - coord[3])) ) { // Verifica se as coordenadas pertencem a mesma diagonal
			return 1;
			
		} else {
			return 2;
		}
	}

}

