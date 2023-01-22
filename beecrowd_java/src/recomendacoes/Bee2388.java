package recomendacoes;
// 
import java.util.Scanner;

public class Bee2388 {
// https://www.beecrowd.com.br/judge/pt/problems/view/2388
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		Tacografo[] calc = new Tacografo[n];
		int dist = 0;
		for(int i=0; i<n; i++) {
			calc[i] = new Tacografo();
			calc[i].setTempo(read.nextInt());
			calc[i].setVelocidade(read.nextInt());
			dist += calc[i].getDistancia();
		}
		read.close();
		System.out.println(dist);
	}

}

class Tacografo {
	private int distancia;
	private int velocidade;
	private int tempo;
	
	public void setTempo(int t) {
		this.tempo = t;
	}
	
	public void setVelocidade (int v) {
		this.velocidade = v;
	}
	
	public int getDistancia() {
		this.distancia = tempo*velocidade;
		return this.distancia;
		
	}
}