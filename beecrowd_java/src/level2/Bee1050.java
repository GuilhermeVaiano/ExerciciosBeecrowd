package level2;

import java.util.Scanner;

public class Bee1050 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		Discagem[] ddd = new Discagem[8];
		ddd[0] = new Discagem(61,"Brasilia");
		ddd[1] = new Discagem(71,"Salvador");
		ddd[2] = new Discagem(11,"Sao Paulo");
		ddd[3] = new Discagem(21,"Rio de Janeiro");
		ddd[4] = new Discagem(32,"Juiz de Fora");
		ddd[5] = new Discagem(19,"Campinas");
		ddd[6] = new Discagem(27,"Vitoria");
		ddd[7] = new Discagem(31,"Belo Horizonte");
		
		int verificaDdd = read.nextInt();
		int cont = 0;
		for (int i = 0; i<8; i++) {
			if(verificaDdd == ddd[i].getDdd()) {
				System.out.printf("%s\n", ddd[i].getDestino());
				cont++;
				break;
			}
		}
		if (cont == 0) System.out.println("DDD nao cadastrado");
	}

}

class Discagem {
	private int ddd;
	private String destino;
	
	public Discagem(int ddd,String destino){
		this.ddd = ddd;
		this.destino = destino;
	}
	
	public int getDdd() {
		return this.ddd;
	}
	
	public String getDestino() {
		return this.destino;
	}
}