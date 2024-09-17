package AceptaElReto;

import java.util.Scanner;

public class p573 {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            int delegadosTotales = 0;
            int minIndecisos = INF;

            for (int i = 0; i < n; ++i) {
                int delegado = scan.nextInt();
                int donald = scan.nextInt();
                int oponente = scan.nextInt();
                int indecisos = scan.nextInt();
                delegadosTotales += delegado;
                int thisVotos = donald + oponente + indecisos;
                int votosNecesarios = (thisVotos + 1) / 2 - donald; // Simplificamos el cálculo de votos necesarios
                if (votosNecesarios <= indecisos) {
                    minIndecisos = Math.min(minIndecisos, votosNecesarios);
                }
            }

            for (int mask = 0; mask < (1 << n); mask++) {
                int totalDelegados = 0;
                int totalVotosNecesarios = 0;

                for (int i = 0; i < n; i++) {
                    int delegado = scan.nextInt(); // Ahora se leen los valores directamente sin almacenarlos
                    int donald = scan.nextInt();
                    int oponente = scan.nextInt();
                    int indecisos = scan.nextInt();
                    if ((mask & (1 << i)) != 0) {
                        totalDelegados += delegado;
                        int thisVotos = donald + oponente + indecisos;
                        int votosNecesarios = (thisVotos + 1) / 2 - donald;
                        totalVotosNecesarios += votosNecesarios;
                    }
                }

                if (totalDelegados >= (delegadosTotales + 1) / 2) {
                    minIndecisos = Math.min(minIndecisos, totalVotosNecesarios);
                }
            }

            if (minIndecisos == INF) {
                System.out.println("IMPOSIBLE");
            } else {
                System.out.println(minIndecisos);
            }
        }
        scan.close();
    }
}
