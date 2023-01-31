package ad_hoc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Bee1216 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1216
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in).useLocale(Locale.US);
		List<CasaAmigo> amigos = new ArrayList<>();
		String amigo;
		double distMedia = 0, distancia = 0;
		while (true) {
			try {
				amigo = read.nextLine();
			} catch (java.util.NoSuchElementException e) {
				break;
			}
			if(amigo.isEmpty()) break;
			String d = read.nextLine();
			distancia = Double.parseDouble(d);
			amigos.add(new CasaAmigo(amigo,distancia));
		} 
		
		for(CasaAmigo casas : amigos) {
			distMedia += casas.getDistancia();
		}
		distMedia = distMedia/(double)amigos.size();
		DecimalFormat df = new DecimalFormat("#.#");
		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator('.');
		df.setDecimalFormatSymbols(symbols);
		System.out.println(df.format(distMedia));
		
		read.close();
	}

}

class CasaAmigo {
	private String nome;
	private double distancia;
	
	public CasaAmigo(String amigo, double distancia) {
		this.nome = amigo;
		this.distancia = distancia;
	}
	
	public double getDistancia() {
		return this.distancia;
	}
	
}