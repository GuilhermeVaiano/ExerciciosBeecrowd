package recomendacoes;

public class Questao11Bis {

	public static void main(String[] args) {
		int[] eventos = {10,-20,61,-15};
		System.out.println(getBattery(eventos));

	}

	private static int getBattery(int [] eventos) {
		int cargaFinal = 50;
		for (int i=0; i< eventos.length; i++) {
			cargaFinal += eventos[i];
			if (cargaFinal > 100) {
				cargaFinal = 100;
				
			} else if (cargaFinal < 0) {
				cargaFinal = 0;
			}
		}
		return cargaFinal;
		
	}

}
