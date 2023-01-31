package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee1168 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1168
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Map<Character,Integer> qtdLeds = new HashMap<>();
		qtdLeds.put('0', 6);
		qtdLeds.put('1', 2);
		qtdLeds.put('2', 5);
		qtdLeds.put('3', 5);
		qtdLeds.put('4', 4);
		qtdLeds.put('5', 5);
		qtdLeds.put('6', 6);
		qtdLeds.put('7', 3);
		qtdLeds.put('8', 7);
		qtdLeds.put('9', 6);
		
		int qtdCasos = read.nextInt();
		read.nextLine();
		for(int i = 0; i<qtdCasos; i++) {
			int leds = 0;
			String num = read.nextLine();
			
			for(int j = 0; j<num.length(); j++) {
				leds += qtdLeds.get(num.charAt(j));	
			}
			
			System.out.println(leds + " leds");
			
		}
		
		read.close();
		
	}

}
