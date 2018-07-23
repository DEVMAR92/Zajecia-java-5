import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj X");
        double xPoint = input.nextDouble();
        System.out.println("Podaj Y");
        double yPoint = input.nextDouble();

        if (xPoint > 0 && yPoint > 0) {
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży w II ćwiartce układu współrzędnych");
        } else if (xPoint > 0 && yPoint < 0) {
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży w IV ćwiartce układu współrzędnych");
        } else if (xPoint < 0 && yPoint > 0) {
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży w I ćwiartce układu współrzędnych");
        } else if (xPoint < 0 && yPoint < 0) {
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży w III ćwiartce układu współrzędnych");
        } else if (xPoint == 0 && yPoint > 0 || yPoint < 0) {
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży na osi Y w punkcie Y = " + yPoint);
        } else if (yPoint == 0 && xPoint > 0 || xPoint < 0) {
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży na osi X w punkcie X = " + xPoint);
        } else
            System.out.println("Punkt(" + xPoint + ", " + yPoint + ") leży w punkcie 0 układu");

        input.close();
    }
}
