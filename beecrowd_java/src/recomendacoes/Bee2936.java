package recomendacoes;

import java.util.Scanner;

public class Bee2936 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Consumo[] cliente = new Consumo[5];
		cliente[0] = new Consumo("Curupira",300);
		cliente[1] = new Consumo("Boitatá",1500);
		cliente[2] = new Consumo("Boto",600);
		cliente[3] = new Consumo("Mapinguari",1000);
		cliente[4] = new Consumo("Iara",150);
		int qtd = 225;
		for(int i=0; i<5; i++) {
			qtd += cliente[i].getQtd(read.nextInt());
		}
		System.out.println(qtd);
	}

}

class Consumo {
	private String nome;
	private int qtdBatata;
	
	
	public Consumo(String nome, int qtd) {
		this.nome = nome;
		this.qtdBatata = qtd;
	}
	
	public int getQtd(int n) {
		return this.qtdBatata*n;
	}
}
