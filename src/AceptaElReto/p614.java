package AceptaElReto;

import java.util.Scanner;

public class p614 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tren, anden;
        while (true) {
            tren = scan.nextInt();
            anden = scan.nextInt();
            if (tren == 0 || anden == 0) break;
            int[] pasajeros = new int[anden];
            for (int i = 0; i < anden; ++i) pasajeros[i] = scan.nextInt();

            int pasajerosDelante = 0;
            int pasajerosDetras = 0;
            long longDelante = 0;
            long longDetras = 0;

            for (int pos = tren; pos < anden; pos++) {
                int distancia = pos - (tren-1);
                longDelante += (long) distancia * pasajeros[pos];
                pasajerosDelante += pasajeros[pos];
            }
            long minLong = longDelante;
            for (int pos = 0; tren < anden; pos++, tren++) {
                pasajerosDetras += pasajeros[pos];
                longDetras += pasajerosDetras;
                longDelante -= pasajerosDelante;
                pasajerosDelante -= pasajeros[tren];
                minLong = Math.min(minLong, longDelante + longDetras);
            }
            System.out.println(minLong);
        }
    }
}