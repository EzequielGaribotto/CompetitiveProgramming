package AceptaElReto.escalfament2025nac;

import java.util.*;

public class K {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int numInstrucciones = scan.nextInt();
            if (numInstrucciones == 0) break;

            List<Instruccion> instrucciones = new ArrayList<>();
            for (int i = 0; i < numInstrucciones; i++) {
                int pasos = scan.nextInt();
                String direccion = scan.next();
                instrucciones.add(new Instruccion(pasos, direccion));
            }

            procesarCaso(instrucciones);
        }
    }

    static void procesarCaso(List<Instruccion> instrucciones) {
        List<int[]> camino = new ArrayList<>();
        int x = 0, y = 0;
        camino.add(new int[]{x, y});

        for (Instruccion instruccion : instrucciones) {
            for (int i = 0; i < instruccion.pasos; i++) {
                switch (instruccion.direccion) {
                    case "N": y--; break;
                    case "S": y++; break;
                    case "E": x++; break;
                    case "O": x--; break;
                }
                camino.add(new int[]{x, y});
            }
        }

        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;

        for (int[] pos : camino) {
            minX = Math.min(minX, pos[0]);
            minY = Math.min(minY, pos[1]);
            maxX = Math.max(maxX, pos[0]);
            maxY = Math.max(maxY, pos[1]);
        }

        int ancho = maxX - minX + 3;
        int alto = maxY - minY + 3;
        char[][] mapa = new char[alto][ancho];

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
                    mapa[i][j] = '#';
                } else {
                    mapa[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < camino.size(); i++) {
            int[] pos = camino.get(i);
            int mapaY = pos[1] - minY + 1;
            int mapaX = pos[0] - minX + 1;

            if (mapa[mapaY][mapaX] == ' ') {
                mapa[mapaY][mapaX] = '.';
            }
        }

        int[] inicio = camino.get(0);
        int[] fin = camino.get(camino.size() - 1);

        mapa[inicio[1] - minY + 1][inicio[0] - minX + 1] = 'O';
        mapa[fin[1] - minY + 1][fin[0] - minX + 1] = 'F';

        for (char[] fila : mapa) {
            System.out.println(new String(fila));
        }
        System.out.println();
    }

    static class Instruccion {
        int pasos;
        String direccion;

        Instruccion(int pasos, String direccion) {
            this.pasos = pasos;
            this.direccion = direccion;
        }
    }
}