package level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bee1789 {
	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		while(true) {
			int qtd = 0;
			try {
				qtd = Integer.parseInt(read.nextLine());
			} catch (NoSuchElementException e) {
				break;
			}
			
			String[] entradas = read.nextLine().split(" ");
			List<Integer> velLesmas = new ArrayList<>();
			for(int i = 0; i<qtd; i++) {
				int n = Integer.parseInt(entradas[i]);
				velLesmas.add(n);
			}
			
			int velMaior = Collections.max(velLesmas);
			int nivelVel = 1;
			if(velMaior >= 20) {
				nivelVel = 3;
			} else if(velMaior >= 10 && velMaior < 20) {
				nivelVel = 2;
			}
			
			System.out.println(nivelVel);
			
		}
		
	}

}
