package AceptaElReto;

import java.util.PriorityQueue;
import java.util.Scanner;
class Objeto implements Comparable<Objeto> {
    String nombre;
    int valor, peso, addedAt;

    Objeto(String nombre, int valor, int peso, int addedAt) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
        this.addedAt = addedAt;
    }

    @Override
    public int compareTo(Objeto other) {
        if (this.valor == other.valor) {
            if (this.peso == other.peso) {
                return other.addedAt - this.addedAt;
            } else {
                return this.peso - other.peso;
            }
        }
        return other.valor - this.valor;
    }
}

/**
 PriorityQueue "poll()" devolverá el objeto con el valor más alto, si hay dos objetos con el mismo valor, devolverá el que tenga el peso más bajo, si hay dos objetos con el mismo valor y peso, devolverá el que fue añadido primero.
 */

public class p661 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int N = scan.nextInt();
            int N2 = N;
            if (N == 0) break;
            PriorityQueue<Objeto> q = new PriorityQueue<>();
            while (N2-- > 0) {
                q.add(new Objeto(scan.next(), scan.nextInt(), scan.nextInt(), N2));
            }

            for (int i=0; i<N; i++) {
                System.out.print(q.poll().nombre);
                if (i+1 != N) System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
}