package ad_hoc;

import java.util.Scanner;

public class Bee1796 {
//https://www.beecrowd.com.br/judge/pt/problems/view/1796
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numPessoas = read.nextInt();
		read.nextLine();
		String[] opiniao = new String[numPessoas];
		opiniao = read.nextLine().split(" ");
		int opPositiva = 0, opNegativa = 0;
		
		for(int i = 0; i<numPessoas; i++) {
			int numPesq = Integer.parseInt(opiniao[i]);
			if (numPesq == 0) opPositiva++;
			else if (numPesq == 1) opNegativa++;
		}
		
		if(opPositiva <= opNegativa) System.out.println('N');
		else System.out.println('Y');
		read.close();
	}

}
