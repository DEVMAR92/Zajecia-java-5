public class Zadanie12 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                sum = sum + i;
            }
        }
        System.out.println("\nSuma liczb parzystych z przediału 0 - 100 wynosi: " + sum);

    }
}
