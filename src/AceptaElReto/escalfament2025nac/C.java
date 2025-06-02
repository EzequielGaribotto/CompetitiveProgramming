package AceptaElReto.escalfament2025nac;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        for (int i = 0; i < casos; i++) {
            long a = scan.nextLong();
            long b = scan.nextLong();
            long xor = a ^ b;
            int distancia = Long.bitCount(xor);
            System.out.println(distancia);
        }
    }
}