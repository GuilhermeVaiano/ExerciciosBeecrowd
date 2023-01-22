package ad_hoc;

import java.util.Scanner;


public class Bee1121 {
//  https://www.beecrowd.com.br/judge/pt/problems/view/1121
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int linhas = 1, colunas = 1, instrucoes = 1;
		while(true) {
			linhas = read.nextInt();
			colunas = read.nextInt();
			instrucoes = read.nextInt();
			if ((linhas == 0 && colunas == 0 && instrucoes == 0)) break;
			read.nextLine();
			Arena arena = new Arena(linhas,colunas);
			int[] inicio = new int[2];
			inicio = arena.preencheArena(read);
			String[] movimentos = new String[instrucoes];
			movimentos = read.nextLine().split("");
			System.out.println(arena.rali(inicio, movimentos));
		}
	}

}


class Arena {
	Campo[][] campo;
	private int nLinhas;
	private int nColunas;
	
	public Arena(int l, int c) {
		this.nLinhas = l;
		this.nColunas = c;
		this.campo = new Campo[l][c];
		constroiArena(campo);
	}
	
	public int getnLinhas() {
		return this.nLinhas;
	}
	
	public int getnColunas() {
		return this.nColunas;
	}
	
	public void constroiArena(Campo[][] campo) {
		for(int l=0; l<nLinhas; l++)
			for (int c=0; c<nColunas; c++) {
				this.campo[l][c] = new Campo();
			}
	}
	
	public int[] preencheArena(Scanner read) {
		boolean inicioEncontrado = false;
		int[] coordInicio = new int[2];
		String caractere = new String();
		for(int l=0; l< this.getnLinhas(); l++) {
			caractere = read.nextLine();
			for (int c=0; c< this.getnColunas(); c++) {
				char simbolo = caractere.charAt(c);
				campo[l][c].setCaractere(simbolo);
				if((simbolo == 'N' || simbolo == 'S' || simbolo == 'L' || simbolo == 'O') && !inicioEncontrado) {
					coordInicio[0] = l;
					coordInicio[1] = c;
					inicioEncontrado = true;
				}
			}
		}
		return coordInicio;
	}
	
	public int rali(int[] inicio,String[] movimentos) {
		int figurinhas = 0, posicaoL = inicio[0], posicaoC = inicio[1];
		int[] coordAtual = new int[inicio.length];
		coordAtual[0] = inicio[0];
		coordAtual[1] = inicio[1];
		char direcao = campo[inicio[0]][inicio[1]].getCaractere();
		
		for(int i=0; i<movimentos.length; i++) {
			if(movimentos[i].equals("F")) {
		
				switch(direcao) {
					case 'N': posicaoL--; break;
					case 'S': posicaoL++; break;
					case 'O': posicaoC--; break;
					case 'L': posicaoC++; break;
				}
				
				if (posicaoC >= nColunas) {
					posicaoC--;
					continue;
				}
				
				if (posicaoL >= nLinhas) {
					posicaoL--;
					continue;
				}
				
				if (posicaoL < 0) {
					posicaoL++;
					continue;
				}
				
				if (posicaoC < 0) {
					posicaoC++;
					continue;
				}
				
				char proxMov = campo[posicaoL][posicaoC].getCaractere();
				if(proxMov == '#') {
					switch(direcao) {
						case 'N': posicaoL++; break;
						case 'S': posicaoL--; break;
						case 'O': posicaoC++; break;
						case 'L': posicaoC--; break;
					}
					
					continue;
				} else {
					coordAtual[0] = posicaoL;
					coordAtual[1] = posicaoC;
					if(proxMov == '*') {
						figurinhas++;
						campo[posicaoL][posicaoC].setCaractere('.');	
					}
					continue;
				}
				
			} else if(movimentos[i].equals("D")) {
				switch(direcao) {
					case 'N': direcao = 'L'; break;
					case 'L': direcao = 'S'; break;
					case 'S': direcao = 'O'; break;
					case 'O': direcao = 'N'; break;
				}
				continue;
			
			
			}else if(movimentos[i].equals("E")) {
				switch(direcao) {
					case 'N': direcao = 'O'; break;
					case 'O': direcao = 'S'; break;
					case 'S': direcao = 'L'; break;
					case 'L': direcao = 'N'; break;
				}
			}
		}
		
		return figurinhas;
	}
}



class Campo {
	private char caractere;
	
	public Campo() {
		this.caractere = ' ';
	}
	
	public void setCaractere(char c) {
		this.caractere = c;
	}
	
	public char getCaractere() {
		return this.caractere;
	}
}
