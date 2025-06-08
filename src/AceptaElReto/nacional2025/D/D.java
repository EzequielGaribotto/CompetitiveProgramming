package AceptaElReto.nacional2025.D;

import java.util.Scanner;
public class D {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            int naparatos = scan.nextInt();
            if (naparatos == 0){
                break;
            } else {
                Integer[] aparatos = new Integer[naparatos];
                Boolean[] aparOnOff = new Boolean[naparatos];

                for (int i = 0; i < naparatos; i++){
                    aparatos[i] = scan.nextInt();
                    aparOnOff[i] = false;
                }
                int maxCons = 0;
                int consActual = 0;
                while (true){
                    int apCurrent = scan.nextInt();
                    if (apCurrent == 0){
                        break;
                    } else {
                        apCurrent--;
                        if(aparOnOff[apCurrent]){
                            consActual -= aparatos[apCurrent];
                        } else {
                            consActual += aparatos[apCurrent];
                        }
                        aparOnOff[apCurrent] = !aparOnOff[apCurrent];
                        maxCons = Math.max(consActual, maxCons);
                    }
                }
                System.out.println(maxCons);

            }




        }

    }
}
