package AceptaElReto;

import java.util.*;

class Estado implements Comparable<Estado> {
    int casa, esfuerzo;

    public Estado(int casa, int esfuerzo) {
        this.casa = casa;
        this.esfuerzo = esfuerzo;
    }

    @Override
    public int compareTo(Estado estado) {
        return this.esfuerzo - estado.esfuerzo;
    }
}

class Conexion {
    int origen, destino, esfuerzo;

    public Conexion(int origen, int destino, int esfuerzo) {
        this.origen = origen;
        this.destino = destino;
        this.esfuerzo = esfuerzo;
    }

}

class Grafo {

    List<Conexion>[] adjacentList;
    int size;

    public Grafo(int size) {

        this.size = size;
        adjacentList = new ArrayList[size + 1];

        for (int i = 1; i <= this.size; i++)
            adjacentList[i] = new ArrayList<>();

    }

    public void addConexion(int origen, int destino, int esfuerzo) {
        if (origen >= 0 && origen < adjacentList.length) {
            adjacentList[origen].add(new Conexion(origen, destino, esfuerzo));
        }
    }

    public void dijkstra(int start, int[] esfuerzos) {

        PriorityQueue<Estado> cua = new PriorityQueue<>();
        Arrays.fill(esfuerzos, Integer.MAX_VALUE);

        cua.add(new Estado(start, 0));
        esfuerzos[start] = 0;

        while (!cua.isEmpty()) {

            Estado current = cua.poll();

            for (Conexion conexion : adjacentList[current.casa]) {
                int esfuerzo = current.esfuerzo + conexion.esfuerzo;
                if (esfuerzo >= esfuerzos[conexion.destino]) continue;
                esfuerzos[conexion.destino] = esfuerzo;
                cua.add(new Estado(conexion.destino, esfuerzo));
            }

        }

    }

}

public class p292 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int casas, conexiones, oficina, paquetes, minEsfuerzo;
        int origen, destino, esfuerzo;
        int esfuerzoIda, esfuerzoVuelta;
        int[] distIda, distVuelta;
        boolean imposible;

        while (s.hasNext()) {

            casas = s.nextInt();
            conexiones = s.nextInt();

            Grafo ida = new Grafo(casas+1);
            Grafo vuelta = new Grafo(casas+1);

            for (int i = 0; i < conexiones; i++) {
                origen = s.nextInt();
                destino = s.nextInt();
                esfuerzo = s.nextInt();
                ida.addConexion(origen, destino, esfuerzo);
                vuelta.addConexion(destino, origen, esfuerzo);
            }

            oficina = s.nextInt();
            paquetes = s.nextInt();

            distIda = new int[casas + 1];
            distVuelta = new int[casas + 1];
            ida.dijkstra(oficina, distIda);
            vuelta.dijkstra(oficina, distVuelta);

            minEsfuerzo = 0;
            imposible = false;

            for (int i = 0; i < paquetes; i++) {
                int casa = s.nextInt();
                esfuerzoIda = distIda[casa];
                esfuerzoVuelta = distVuelta[casa];
                if (esfuerzoIda == Integer.MAX_VALUE || esfuerzoVuelta == Integer.MAX_VALUE) {
                    imposible = true;
                    break;
                } else {
                    minEsfuerzo += (esfuerzoIda+esfuerzoVuelta);
                }
            }

            System.out.println(imposible ? "Imposible" : minEsfuerzo);
        }

    }

}
