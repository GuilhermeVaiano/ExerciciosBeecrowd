package strings;


import java.util.Scanner;

public class Bee1581 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = Integer.parseInt(read.nextLine());
		
		for (int i = 0; i<n; i++) {
			int qtd = Integer.parseInt(read.nextLine());
			String[] idiomas = new String[qtd];
			
			for(int j=0; j<qtd; j++) {
				idiomas[j] = read.nextLine();
			}
			
			String idiomaApropriado = idiomas[0];
			for(int k=0; k< idiomas.length-1; k++) {
				if (!idiomaApropriado.equals(idiomas[k])) {
					idiomaApropriado = "ingles";
					break;
				}
			}
			
			System.out.println(idiomaApropriado);
			
		}
		read.close();

	}
}


