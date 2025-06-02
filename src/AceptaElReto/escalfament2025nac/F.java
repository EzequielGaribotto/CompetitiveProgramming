package AceptaElReto.escalfament2025nac;

import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();

        for (int i = 0; i < casos; i++) {
            long personas = scan.nextLong();
            long higos = scan.nextLong();

            long higosPers = higos / personas;

            long higosSobrantes = higos % personas;

            long higosManola = higosPers + higosSobrantes;

            System.out.println(higosManola);
        }
    }
}