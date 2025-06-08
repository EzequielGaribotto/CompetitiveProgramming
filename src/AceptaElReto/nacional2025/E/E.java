package AceptaElReto.nacional2025.E;

import java.util.Arrays;
import java.util.Scanner;

public class E {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while (true){
            int totChurros = scan.nextInt();
            int serChurros = scan.nextInt();
            if (totChurros == 0 && serChurros == 0){
                break;
            } else {
                serChurros--;
                int[] churLength = new int[totChurros];
                for (int i = 0; i < totChurros; i++){
                    churLength[i] = scan.nextInt();
                }
                Arrays.sort(churLength);
                int posmin = 0;
                int mindist = Integer.MAX_VALUE;

                for (int i = 0; i < totChurros-serChurros; i++){
                    int dif = churLength[i+serChurros] - churLength[i];
                    if(dif < mindist){
                        mindist = dif;
                        posmin = i;
                    }
                }

                System.out.println(churLength[posmin] + " " + churLength[posmin+serChurros]);

            }




        }

    }
}
