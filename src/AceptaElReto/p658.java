package AceptaElReto;

import java.util.Scanner;

public class p658 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bloques = scan.nextInt();
        while (bloques != 0) {
            int altura = 0;
            int size = 1;
            boolean possible = true;
            while (possible) {
                int bloquesNecesarios = size*size;
                if (bloques>=bloquesNecesarios) {
                    altura++;
                    bloques -=bloquesNecesarios;
                    size += 2;
                } else {
                    if (bloques>0) {
                        altura++;
                    }
                    possible = false;
                }
            }
            System.out.println(altura);
            bloques = scan.nextInt();
        }
    }
}