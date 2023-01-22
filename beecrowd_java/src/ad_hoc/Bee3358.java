package ad_hoc;
// Ta dando Wrong Answer(100%).
import java.util.Scanner;

public class Bee3358 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		read.nextLine();
		String[] nomes = new String[n];
		int consoantes = 0;
		for(int i= 0; i<n; i++) {
			nomes[i] = read.nextLine();
			for(int j=0; j < nomes[i].length(); j++) {
				String verif = nomes[i].toLowerCase();
				char c = verif.charAt(j);
				if (c == 97 | c == 101 | c == 105 | c == 111 | c == 117) consoantes = 0;
				else {
					consoantes++;
					if (consoantes == 3) {
						System.out.printf("%s nao eh facil\n", nomes[i]);
						break;
					}
				}
			}
			if (consoantes == 3) continue;
			else System.out.printf("%s eh facil\n", nomes[i]);
		}
		read.close();
	}

}
