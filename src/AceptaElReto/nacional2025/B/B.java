package AceptaElReto.nacional2025.B;

import java.util.Scanner;
public class B {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i = 0; i < cases; i++){
            float nc = scan.nextInt();
            float np = scan.nextInt();

            if (nc%3 != 0){
                if (np > 2*(nc/3)){
                    System.out.println("Fumata blanca");
                } else {
                    System.out.println("Fumata negra");
                }
            } else {
                if (np >= 2*(nc/3)){
                    System.out.println("Fumata blanca");
                } else {
                    System.out.println("Fumata negra");
                }
            }


        }
    }
}
