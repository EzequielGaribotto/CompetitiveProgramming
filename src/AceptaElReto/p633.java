package AceptaElReto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class p633 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int casos = scan.nextInt();
            if (casos == 0) break;
            // Mapas para almacenar el tipo de animal y la cantidad de animales de este tipo segun su genero
            HashMap<String, Integer> animalesHembra = new HashMap<>();
            HashMap<String, Integer> animalesMacho = new HashMap<>();

            // HashSet para almacenar los animales del input sin repetirlos
            HashSet<String> animales = new HashSet<>();

            // Consumimos la linea del int para evitar problemas de lectura de entradas
            scan.nextLine();
            String[] entrada = scan.nextLine().split(" ");


            for (String str : entrada) {
                // Eliminamos la ultima letra del animal y añadimos el nombre al Set
                String animal = str.substring(0, str.length() - 1);
                animales.add(animal);

                // Añadimos el animal al HashMap segun su genero o modificamos su cantidad (+1)
                if (str.endsWith("o")) {
                    int machos = animalesMacho.containsKey(animal) ? (animalesMacho.get(animal) + 1) : 1;
                    animalesMacho.put(animal, machos);
                } else {
                    int hembras = animalesHembra.containsKey(animal) ? (animalesHembra.get(animal) + 1) : 1;
                    animalesHembra.put(animal, hembras);
                }
            }
            int parejas,sobrantes,sinPareja;
            parejas = sobrantes = sinPareja = 0;

            for (String animal : animales) {
                // Agarramos el int del HashMap de los animales macho y hembra si contiene la key "animal", si no la contiene, es 0.
                int machos = animalesMacho.containsKey(animal) ? (animalesMacho.get(animal)) : 0;
                int hembras = animalesHembra.containsKey(animal) ? (animalesHembra.get(animal)) : 0;
                // Determinamos si se puede formar una pareja
                if (hembras != 0 && machos != 0) {
                    parejas++;
                }
                // Determinamos si el animal no tiene pareja para su especie
                if ((hembras == 0 || machos == 0) && (machos != hembras)) {
                    sobrantes++;
                }
                // Determinamos si sobra algun animal porque su especie ya forma una pareja
                // Una misma especie NO puede formar más de una pareja
                sinPareja += Math.max(hembras - 1, 0) + Math.max(machos - 1, 0);
            }

            System.out.println(parejas + " " + sobrantes + " " + sinPareja);
        }
    }
}
