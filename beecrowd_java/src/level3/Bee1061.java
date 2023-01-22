package level3;
import java.util.Scanner;

public class Bee1061 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1061
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Data[] evento = new Data[2];
		for (int i=0; i<2; i++) {
			String[] ler = read.nextLine().split(" ");
			int d = Integer.parseInt(ler[1]);
			String[] t = read.nextLine().split(" : ");
			evento[i] = new Data(d,t);
		}
		evento[1].duracao(evento[0]);
	}

}

class Data {
	private int dia;
	private int hora;
	private int minuto;
	private int segundo;
	
	public Data(int d,String[] t) {
		this.dia = d;
		this.hora = Integer.parseInt(t[0]);
		this.minuto = Integer.parseInt(t[1]);
		this.segundo = Integer.parseInt(t[2]);
	}
	
	public void duracao(Data data) {
		this.segundo -= data.segundo;
		if(this.segundo < 0) {
			this.minuto--;
			this.segundo += 60;
		}
		
		this.minuto -= data.minuto;
		if (this.minuto < 0) {
			this.hora--;
			this.minuto += 60;
		}
		
		this.hora -= data.hora;
		if (this.hora < 0) {
			this.dia--;
			this.hora +=24;
		}
		
		this.dia -= data.dia;
		formataSaida();
	}
	
	public void formataSaida() {
		System.out.printf("%d dia(s)\n", this.dia);
		System.out.printf("%d hora(s)\n", this.hora);
		System.out.printf("%d minuto(s)\n", this.minuto);
		System.out.printf("%d segundo(s)\n", this.segundo);
	}
}
