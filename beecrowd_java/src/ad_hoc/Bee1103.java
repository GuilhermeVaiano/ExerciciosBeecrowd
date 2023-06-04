package ad_hoc;

import java.util.Scanner;

public class Bee1103 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		while(true) {
			int h1 = read.nextInt();
			int m1 = read.nextInt();
			int h2 = read.nextInt();
			int m2 = read.nextInt();
			
			if (h1+m1+h2+m2 == 0) break;
			
			Time t1 = new Time(h1,m1);
			Time t2 = new Time(h2,m2);
			
			System.out.println(t1.tempoAlarme(t2));
			read.nextLine();
		}
		read.close();
	}

}


class Time {
	private int hour;
	private int min;
	
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMin() {
		return this.min;
	}
	
	public int tempoAlarme(Time t2) {
		int horaAtual = (this.getHour() * 60) + this.getMin();
		int horaAlarme = (t2.getHour() * 60) + t2.getMin();
		
		if (horaAlarme <= horaAtual) {
			horaAlarme += (24 * 60);
		}
		
		return horaAlarme - horaAtual;
	}
}
