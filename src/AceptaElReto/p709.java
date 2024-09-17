package AceptaElReto;

import java.util.*;

public class p709 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nVotos = scan.nextInt();

        while (nVotos != 0) {
            Map<String, Integer> votosCandidatos = new HashMap<>();

            for (int i = 0; i < nVotos; i++) {
                String voto = scan.next();
                votosCandidatos.put(voto, votosCandidatos.containsKey(voto) ? votosCandidatos.get(voto) + 1 : 1);
            }

            int maxVotos = 0;
            String ganador = "EMPATE";

            for (Map.Entry<String, Integer> entry : votosCandidatos.entrySet()) {
                if (entry.getValue() > maxVotos) {
                    maxVotos = entry.getValue();
                    ganador = entry.getKey();
                } else if (entry.getValue() == maxVotos) {
                    ganador = "EMPATE";
                }
            }

            System.out.println(ganador);
            nVotos = scan.nextInt();
        }
    }
}