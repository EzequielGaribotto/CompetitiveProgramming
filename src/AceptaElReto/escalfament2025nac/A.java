package AceptaElReto.escalfament2025nac;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            int t = scan.nextInt();
            if (n == 0 && t == 0) break;
            int[] tiempos = new int[n];
            for (int i = 0; i < n; i++) {
                tiempos[i] = scan.nextInt();
            }
            Arrays.sort(tiempos);
            int resueltos = 0;
            int tiempoAcumulado = 0;
            int penalizacion = 0;
            for (int i = 0; i < n; i++) {
                if (tiempoAcumulado + tiempos[i] > t) break;
                tiempoAcumulado += tiempos[i];
                penalizacion += tiempoAcumulado;
                resueltos++;
            }
            System.out.println(resueltos + " " + penalizacion);
        }
    }
}