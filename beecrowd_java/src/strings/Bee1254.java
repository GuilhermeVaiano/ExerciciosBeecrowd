package strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bee1254 {
// https://www.beecrowd.com.br/judge/pt/problems/view/1254
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		while(read.hasNextLine()) {
			String tag = read.nextLine();
			String subs = read.nextLine();
			String line = read.nextLine();
			
			int inicio = line.indexOf("<");
			int fim = line.indexOf(">");
			
			Pattern p = Pattern.compile(tag, Pattern.CASE_INSENSITIVE);
			Matcher match = p.matcher(line);
			line = match.replaceAll(subs);
			System.out.println(line);
			
		}

	}

}
