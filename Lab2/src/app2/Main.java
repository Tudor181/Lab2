package app2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Masina masina = new Masina();
        masina.setColor("red");
        masina.setType("van");
        masina.setSpeed(180.5);
        System.out.println("culoare: " + masina.getColor());
        System.out.println("viteza: " + masina.getSpeed());
        System.out.println("tip: " + masina.getType());
        System.out.println("detalii to string " + masina.toString());
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Masina[] masini = new Masina[n];
        scanner.close();

    }
}
