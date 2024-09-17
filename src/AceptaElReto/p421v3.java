package AceptaElReto;

import java.util.*;

import static java.util.Arrays.sort;

class Intervalov3 implements Comparable<Intervalov3> {
    int inicio, fin;

    public Intervalov3(int i, int f) {
        this.inicio = i;
        this.fin = f;
    }

    @Override
    public int compareTo(Intervalov3 otro) {
        return otro.inicio - this.inicio;
    }
}

public class p421v3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int L = scan.nextInt();
            int nRestaurantes = scan.nextInt();
            Intervalov3[] restaurantes = new Intervalov3[nRestaurantes];
            for (int i = 0; i < nRestaurantes; i++) {
                int x = scan.nextInt();
                int r = scan.nextInt();
                restaurantes[i] = new Intervalov3(x - r, x + r);
            }
            sort(restaurantes);

            int limiteIzq = 0, limiteDer = 0, r = 0;
            int restaurantesNoUsados = nRestaurantes;
            while (r < nRestaurantes && limiteDer < L) {
                while (r < nRestaurantes && !(restaurantes[r].inicio > limiteIzq)) {
                    limiteDer = Math.max(limiteDer, restaurantes[r].fin);
                    r++;
                }

                if (limiteIzq >= limiteDer) {
                    break; // IMPOSIBLE
                }
                limiteIzq = limiteDer;
                restaurantesNoUsados--;
                if (limiteDer >= L) break; // FINAL POSIBLE
            }

            System.out.println((limiteDer >= 1) ? restaurantesNoUsados : -1);
        }
    }
}
