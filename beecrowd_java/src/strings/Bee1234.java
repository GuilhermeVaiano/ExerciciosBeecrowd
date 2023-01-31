package strings;

import java.util.Scanner;

public class Bee1234 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		while(read.hasNextLine()) {
			String sentenca = read.nextLine();
			if(sentenca.isEmpty()) break;
			char[] sentFinal = sentenca.toCharArray();
			int contador = 0;
			
			for(int i = 0; i<sentFinal.length; i++) {
				if(sentFinal[i] == ' ') {
					continue;
				} else {
					if(contador%2 == 0) {
						sentFinal[i] = Character.toUpperCase(sentFinal[i]);
					}
					
					contador++;
				}
			}
			if(sentFinal.length != 0) {
				System.out.println(sentFinal);
			}
		}
	}

}
