package level5;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Locale.setDefault(new Locale("en","US"));
		String[] notas = read.nextLine().split(" ");
		Notas aluno = new Notas(notas);
		double media = aluno.getMedia();
		
		DecimalFormat df = new DecimalFormat("#0.0");
		System.out.println("Media: " + df.format(aluno.getMedia()));
		System.out.println(aluno.getSituacao());
		
		if (media >=  5.0 && media <= 6.9) {
			double notaExame = Double.parseDouble(read.nextLine());
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			aluno.setMedia(notaExame);
			System.out.println(aluno.getSituacao());
			System.out.println("Media final: "+ df.format(aluno.getMedia()));
		}
		
		read.close();
	}
}


class Notas {
	private double[] notas = new double[4];
	private double media;
	private String situacao;
		
	public Notas(String[] notas) {
		for(int i=0; i<notas.length; i++) {
			this.notas[i] = Double.parseDouble(notas[i]);
		}

		setMedia();
	}
		
	public void setMedia() {
		double somaNotas = 0.0;
		somaNotas += this.notas[0] * 2.0;
		somaNotas += this.notas[1] * 3.0;
		somaNotas += this.notas[2] * 4.0;
		somaNotas += this.notas[3] * 1.0;
		this.media = somaNotas/10;
		setSituacao();
	}
	
	public void setMedia(double notaExame) {
		this.media = (this.media+notaExame)/2;
		
		if(this.media >= 5.0) {
			this.situacao = "Aluno aprovado.";
		} else {
			this.situacao = "Aluno reprovado.";
		}
	}
		
	public void setSituacao() {
		if(this.media >= 7.0) {
			this.situacao = "Aluno aprovado.";
		
		} else if(this.media >=  5.0 && this.media <= 6.9) {
			this.situacao = "Aluno em exame.";
			
		} else {
			this.situacao = "Aluno reprovado.";
		}
	}
		
	public double getMedia() {
		return this.media;
	}
		
	public String getSituacao() {
		return this.situacao;
	}

}
	