package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P2951 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtd = read.nextInt();
		int amizade = read.nextInt();
		Runa[] runas = new Runa[qtd];
		
		for(int i=0; i<qtd; i++) {
			char l = read.next().charAt(0);
			int n = read.nextInt();
			runas[i] = new Runa(l,n);
		}
		int x = read.nextInt();
		char[][] r = new char[x][1];
		for (int i = 0; i < x; i++) {
			r[i] = read.next().toCharArray();
		}
		
		int resultado = buscaValores(runas,r);
		System.out.printf("%d\n", resultado);
		if( resultado >= amizade ) {
			System.out.println("You shall pass!");
		} else {
			System.out.println("My precioooous");
		}
	}
	
	public static int buscaValores(Runa[] runas, char[][] r) {
		List<Integer> valEncontrados = new ArrayList<>();
		int sum = 0;
		if (r.length > 0) {
			for(int i = 0; i < r.length; i++) {
				for (Runa rune : runas) {
					if(rune.getRuna() == r[i][0]) valEncontrados.add(rune.getValor());	
				}
			}
		}
		for (int valor: valEncontrados) sum += valor;
		return sum;
	}
}

class Runa {
	private static int idRuna;
	private char Ri;
	private int Vi;

	
	public Runa(char c, int i) {
		this.Ri = c;
		this.Vi = i;
		Runa.idRuna += 1;
	}
	
	public void setRuna(char c,int i) {
		this.Ri = c;
		this.Vi = i;
	}
	
	public char getRuna() {
		return this.Ri;
	}
	
	public int getValor() {
		return this.Vi;
	}
	

}

