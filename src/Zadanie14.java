import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj " + names.length + " imion");

        for (int j = 0; j != names.length; j++) {
            names[j] = input.nextLine();
        }

        for (int i = names.length - 1; i <= names.length; i--) {
            System.out.println("Cześć " + names[i]);
            if (i == 0) break;
        }
        input.close();
    }
}
