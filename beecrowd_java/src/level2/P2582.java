package level2;

import java.util.Scanner;

public class P2582 {

	public static void main(String[] args) {
		Album musicas = new Album();
		Scanner read = new Scanner(System.in);
		Playlist lista = new Playlist();
		
		musicas.setMusica("PROXYCITY");
		musicas.setMusica("P.Y.N.G.");
		musicas.setMusica("DNSUEY!");
		musicas.setMusica("SERVERS");
		musicas.setMusica("HOST!");
		musicas.setMusica("CRIPTONIZE");
		musicas.setMusica("OFFLINE DAY");
		musicas.setMusica("SALT");
		musicas.setMusica("ANSWER!");
		musicas.setMusica("RAR?");
		musicas.setMusica("WIFI ANTENNAS");
		
		int c = read.nextInt();
		for(int i = c; i > 0; i--) {
			int x = read.nextInt();
			int y = read.nextInt();
			lista.setLista(musicas, x, y);
		}
		lista.exibeLista();
		
	}		
		
}

class Album {
		private int indiceAlbum;
		private String[] musicaDoAlbum;
		
		public Album() {
			this.indiceAlbum = 0;
			this.musicaDoAlbum = new String[20];
		}
		
		public void setMusica(String nome) {
			this.musicaDoAlbum[indiceAlbum] = nome;
			this.indiceAlbum++;
		}
		
		public String getMusica(int index) {
			return this.musicaDoAlbum[index];
		}

	}
	

class Playlist {
	private int inicio;
	private int fim;
	private String[] lista;
	private int tamanho;
	
	public Playlist() {
		inicio = fim = 0;
		tamanho = 100;
		lista = new String[tamanho];
	}
	

	public void setLista(Album album,int x, int y) {
		if (fim != tamanho - 1) {
			this.lista[fim] = album.getMusica(x+y);
			fim++;
		}
	}
	
	public void exibeLista() {
		for (int i = inicio; i<fim; i++) {
			System.out.printf("%s\n", lista[i]);
		}
		
	}
}



