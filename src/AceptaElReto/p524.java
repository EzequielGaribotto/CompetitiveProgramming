package AceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

class Coste implements Comparable<Coste> {
    int cteCompe, cteTencia;

    @Override
    public int compareTo(Coste c) {
        return (this.cteCompe - this.cteTencia) - (c.cteCompe - c.cteTencia);
    }
}

public class p524 {
    public static boolean resuelveCaso(Scanner sc) {
        int numCompras = sc.nextInt();
        if (numCompras == 0)
            return false;
        int minCompe = sc.nextInt();
        int minTencia = sc.nextInt();
        Coste[] costes = new Coste[numCompras];
        for (int i = 0; i < numCompras; ++i) {
            costes[i] = new Coste();
            costes[i].cteCompe = sc.nextInt();
        }
        for (int i = 0; i < numCompras; ++i)
            costes[i].cteTencia = sc.nextInt();
        Arrays.sort(costes);
        int solucion = 0;
        for (int i = 0; i < minCompe; ++i)
            solucion += costes[i].cteCompe;
        for (int j = numCompras - 1; j >= numCompras - minTencia; --j)
            solucion += costes[j].cteTencia;
        for (int i = minCompe; i < numCompras - minTencia; ++i)
            solucion += Math.min(costes[i].cteCompe, costes[i].cteTencia);
        System.out.println(solucion);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (resuelveCaso(sc));
        sc.close();
    }
}

