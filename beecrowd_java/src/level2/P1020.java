package level2;

import java.util.Scanner;

public class P1020 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Idade idade = new Idade();
		int x = read.nextInt();
		idade.setIdade(x);
		idade.exibeIdade();
	}

}



class Idade {
	private int anos;
	private int meses;
	private int dias;
	
	public int getAnos() {
		return anos;
	}
	
	public int getMeses() {
		return meses;
	}
	
	public int getDias() {
		return dias;
	}
	
	public void setIdade(int x) {
	    this.anos = x / 365;
	    x %= 365;
	    this.meses = x / 30;
	    x %= 30;
	    this.dias = x;
	}
	
	public void exibeIdade() {
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", this.anos,this.meses,this.dias);
	}

	
}
