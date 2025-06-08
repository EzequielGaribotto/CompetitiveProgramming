package AceptaElReto.nacional2025.G;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class G {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            int nColores = scan.nextInt();
            if (nColores == 0){
                break;
            } else {
                HashSet<String> setColores = new HashSet<String>();
                for (int c = 0; c < nColores; c++) {
                    setColores.add(scan.next());
                }
                boolean[] arrColores = new boolean[7];
                for (int i= 0; i < 7; i++) {
                    arrColores[i] = false;
                }
                int maxLvl = 0;

                if (setColores.contains("blanco") && setColores.contains("negro")) {
                    arrColores[0] = true;
                    maxLvl = 0;
                }
                if (setColores.contains("rojo")) {
                    arrColores[1] = true;
                    maxLvl = 1;
                }
                if (setColores.contains("verde") || setColores.contains("amarillo")) {
                    arrColores[2] = true;
                    maxLvl = 2;
                }
                if (setColores.contains("verde") && setColores.contains("amarillo")) {
                    arrColores[3] = true;
                    maxLvl = 3;
                }
                if (setColores.contains("azul")) {
                    arrColores[4] = true;
                    maxLvl = 4;

                }
                if (setColores.contains("marron")) {
                    arrColores[5] = true;
                    maxLvl = 5;

                }
                if (setColores.contains("morado") || setColores.contains("rosa") || setColores.contains("naranja") || setColores.contains("gris")) {
                    arrColores[6] = true;
                    maxLvl = 6;
                }
                String result = "";
                for (int i = 0; i <= maxLvl; i++) {
                    if (arrColores[i] == false) {
                        result = "Incorrecta";
                        break;
                    }
                }
                if (result != "Incorrecta") {
                    result = String.valueOf(maxLvl+1);
                    System.out.println("Nivel " + result);
                } else {
                    System.out.println("Incorrecta");
                }



            }
        }

    }
}
