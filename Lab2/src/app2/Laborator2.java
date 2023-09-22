package app2;

import java.util.Random;
import java.util.Scanner;

public class Laborator2 {
    public static void main(String[] args) throws Exception {
        // ex 1
        ContBancar cont = new ContBancar(100.59);
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce ti 2 sume pe care doriti sa le depozitati:");
        double suma1 = scanner.nextDouble();
        cont.depozitareSuma(suma1);
        double suma2 = scanner.nextDouble();
        cont.depozitareSuma(suma2);
        System.out.println("introduceti suma dorita de retragere");

        // ex 2

        ContBancar contEx2 = new ContBancar(500);
        contEx2.depozitareSuma(300);
        System.out.println("Interogare sold:" + contEx2.interogareSold());
        Random rnd = new Random();
        int N = rnd.nextInt(10); // 1000
        System.out.println("random" + N);

        for (int i = 0; i < N; ++i) {
            double n1 = rnd.nextDouble(100);
            double n2 = rnd.nextDouble(100);
            contEx2.depozitareSuma(n1);
            contEx2.retragereSuma(n2);
        }

        double retragereSuma = scanner.nextDouble();

        boolean retragere = cont.retragereSuma(retragereSuma);
        System.out.println(retragere ? "ati retras cu succes" : "retragerea nu a reusit");

        System.out.println(cont.toString());

    }
}
