package AceptaElReto;

import java.util.*;

public class p300 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nCasos = scan.nextInt();
        while (nCasos >= 1) {
            String palabra = scan.next();

            if (palabra.contains("a") &&
                    palabra.contains("e") &&
                    palabra.contains("i") &&
                    palabra.contains("o") &&
                    palabra.contains("u")) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            nCasos--;
        }
    }
}