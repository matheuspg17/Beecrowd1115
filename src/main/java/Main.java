
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int x, y, controle = 1;

        for (int i = 0; i < controle; i++) {
            x = leia.nextInt();
            y = leia.nextInt();

            controle++;

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }else {
                controle = 0;
            }
        }
    }
}
