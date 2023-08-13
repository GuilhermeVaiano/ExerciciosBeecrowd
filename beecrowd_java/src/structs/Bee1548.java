package structs;

import java.util.Arrays;
import java.util.Scanner;

public class Bee1548 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1548
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int qtdCasos = Integer.parseInt(read.nextLine());
		
		for(int i=0; i<qtdCasos; i++) {
			int[] notasAlunos = getInput(read);
			int[] filaOrdenada = ordenarFila(notasAlunos);
			System.out.println(contaAlunosEmOrdem(notasAlunos,filaOrdenada));
		
		}
		
		read.close();
	}


	private static int[] ordenarFila(int[] fila) {
		int[] filaOrdenada = Arrays.copyOf(fila, fila.length);
		Arrays.sort(filaOrdenada);
		inverterFila(filaOrdenada);
		return filaOrdenada;
	}

	private static void inverterFila(int[] fila) {
		int indiceEsquerdo = 0;
		int indiceDireito = fila.length-1;
		
		while(indiceEsquerdo < indiceDireito) {
			int aux = fila[indiceEsquerdo];
			fila[indiceEsquerdo] = fila[indiceDireito];
			fila[indiceDireito] = aux;
			indiceDireito--;
			indiceEsquerdo++;
		}
		
	}


	private static int contaAlunosEmOrdem(int[] filaDeChegada, int[] filaOrdenada) {
		int qtdEmOrdem = 0;
		
		for(int i=0; i<filaOrdenada.length; i++) {
			if (filaDeChegada[i] == filaOrdenada[i]) {
				qtdEmOrdem++;
			}
		}
		return qtdEmOrdem;
	}


	private static int[] getInput(Scanner read) {
		int qtdAlunos = Integer.parseInt(read.nextLine());
		String[] entrada = read.nextLine().split(" ");
		int[] notasAlunos = new int[qtdAlunos];
		
		for(int i=0; i<qtdAlunos; i++) {
			notasAlunos[i] = Integer.parseInt(entrada[i]);
		}
		
		return notasAlunos;
	}

}
