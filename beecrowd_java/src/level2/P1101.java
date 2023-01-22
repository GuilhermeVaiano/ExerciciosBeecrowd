package level2;
import java.io.IOException;
import java.util.Scanner;

public class P1101 {

	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		double pi = 3.14159;
		double r = read.nextDouble();
		double volume = (4.0/3.0)*pi*(Math.pow(r,3));
		System.out.printf("VOLUME = %.3f", volume);
	}

}
