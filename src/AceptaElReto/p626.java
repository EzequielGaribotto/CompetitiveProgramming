package AceptaElReto;

import java.util.Scanner;
public class p626 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        scan.nextLine();
        while (casos > 0) {
            String[] fecha = scan.nextLine().split("/");
            int dia = Integer.parseInt(fecha[0]);
            int mes = Integer.parseInt(fecha[1]);
            int anyo = Integer.parseInt(fecha[2]);
            int siguienteAnyoBisiesto = anyo+1;
            while (siguienteAnyoBisiesto % 4 != 0) {
                siguienteAnyoBisiesto++;
            }
            if (mes < 2 || (mes <= 2 && dia < 29)) {
                System.out.printf("29/02/%04d\n", anyo % 4 == 0 ? anyo : siguienteAnyoBisiesto);
            } else {
                System.out.printf("29/02/%04d\n",siguienteAnyoBisiesto);
            }
            casos--;
        }
    }
}