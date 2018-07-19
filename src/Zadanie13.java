import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i != 1) {
            System.out.println("Podaj liczbę");
            double userInput = scan.nextDouble();
            if (userInput < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (userInput > 200) {
                System.out.println("Podana liczba jest za duża");
            } else {
                if (userInput % 3 != 0) {
                    System.out.println("Liczba jest niepodzielna przez 3");
                } else {
                    System.out.println("Twoja liczba jest ok");
                    break;
                }
            }
        }

    }
}
