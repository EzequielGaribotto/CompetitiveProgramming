package AceptaElReto;

import java.util.Scanner;

public class p362 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fechas = scan.nextInt();
        // Recorrer numero de casos
        while (fechas > 0) {
            // Leer dia del mes
            int dayOfMonth = scan.nextInt();
            // Leer mes
            int month = scan.nextInt();
            // Si es 25 de diciembre, imprimimos "SI" else "NO"
            String result = "";
            if (dayOfMonth == 25 && month == 12) {
                result = "SI";
            } else {
                result = "NO";
            }
            fechas--;
            System.out.println(result);
        }
    }
}