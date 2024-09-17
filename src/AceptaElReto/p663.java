package AceptaElReto;

import java.util.Scanner;

public class p663 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anyos = scan.nextInt();
        // Recorrer numero de casos
        while (anyos > 0) {
            int anyo = scan.nextInt();
            // SI el año es superior a 0 le restamos uno sino no
            int result;
            if (anyo > 0) {
                result = anyo-1;
            } else {
                result = anyo;
            }
            anyos--;
            System.out.println(result);
        }
    }
}