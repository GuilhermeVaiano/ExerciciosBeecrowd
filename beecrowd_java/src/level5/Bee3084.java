package level5;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bee3084 {
	
	public static void main(String args[]) {
		var read = new Scanner(System.in);
		while(true) {
			String[] entradas = new String[2];
			try {
				entradas = read.nextLine().split(" ");
				if (entradas.length < 2) {
					break;
				}
				
			} catch(NoSuchElementException e) {
				break;
			}
			
			var hora = new Hora(entradas);
			System.out.println(hora.horario());
			
		}
		
		read.close();
		
	}

}

class Hora {
	private int grauHora;
	private int grauMinuto;
	
	public Hora(String[] entrada) {
		grauHora = Integer.parseInt(entrada[0]);
		grauMinuto = Integer.parseInt(entrada[1]);
		if (grauMinuto > 360 || grauHora > 360) {
			System.exit(0);
		}
	}

	public String horario() {
		int hora = grauHora/30;
		int min  = grauMinuto/6;
		String saidaHora = formataHorario(hora);
		String saidaMin = formataHorario(min);
		String saidaHorario = saidaHora + ":" + saidaMin;
		return saidaHorario;
	}

	private String formataHorario(int valor) {
		if(valor < 10) {
			String saida = "0" + Integer.toString(valor);
			return saida;
		} else {
			return Integer.toString(valor);
		}
	}


}
