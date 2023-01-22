package level2;

import java.util.Scanner;

public class P3037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            Game game = new Game();
            game.play();
            n--;
        }
    }
}

class Game {
    private int pontJ;
    private int pontM;

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 6; i++) {
            int x = scanner.nextInt();
            int d = scanner.nextInt();
            if (i <= 3) {
                pontJ += x * d;
            } else {
                pontM += x * d;
            }
        }
        System.out.println(pontJ > pontM ? "JOAO" : "MARIA");
    }
}