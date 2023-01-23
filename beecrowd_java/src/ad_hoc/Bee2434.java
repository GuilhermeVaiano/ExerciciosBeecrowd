package ad_hoc;

import java.util.Scanner;

public class Bee2434 {
// https://www.beecrowd.com.br/judge/pt/problems/view/2434
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int diasPeriodo = read.nextInt();
		int saldoInicial = read.nextInt();
		read.nextLine();
		Conta conta = new Conta(saldoInicial);
		conta.registraTransacoes(diasPeriodo, read);
		System.out.println(conta.getMenorSaldo());
	}

}


class Conta {
	private int saldo;
	private int menorSaldo;
	
	public Conta(int saldo) {
		this.saldo = saldo;
		this.menorSaldo  = saldo;
	}
	
	public int getMenorSaldo() {
		return this.menorSaldo;
	}
	
	public void transacao(int valor) {
		this.saldo += valor;
		if(this.menorSaldo > this.saldo) {
			this.menorSaldo = saldo;
		}
	}
	
	public void registraTransacoes(int dias, Scanner scan) {
		for(int i= 0; i< dias; i++) {
			int movDia = scan.nextInt();
			transacao(movDia);
			scan.nextLine();
		}
	}
}