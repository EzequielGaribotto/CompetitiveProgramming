package AceptaElReto.nacional2025.F;

import java.util.Scanner;

public class F {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            int lSequencia = scan.nextInt();
            if (lSequencia == 0){
                break;
            } else {
                long[] sequencia = new long[lSequencia];
                for(int i = 0; i < lSequencia; i++){
                    sequencia[i] = scan.nextLong();
                }
                long sig = sequencia[lSequencia-1] + siguiente(sequencia);
                System.out.println(sig);
            }


        }

    }

    public static long siguiente (long[]entrada){
        long[] difSequencia = new long[entrada.length-1];
        boolean todoCero = true;
        long dif = 0;
        for (int i = 0; i < entrada.length-1; i++){
            difSequencia[i] = entrada[i+1] - entrada[i];
            if(difSequencia[i] != 0){
                todoCero = false;
            }
        }
        if (!todoCero){
            dif = difSequencia[difSequencia.length-1] + siguiente(difSequencia);
        }
        return dif;

    }
}


