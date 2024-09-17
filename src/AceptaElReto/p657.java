package AceptaElReto;

import java.util.Scanner;

public class p657 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nCasos = scan.nextInt();
        while (nCasos >= 1) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int C = scan.nextInt();
            int dAB = Math.abs(A-B);
            int dCB = Math.abs(C-B);
            if (A < 0 && B > 0) {
                dAB--;
            } else if (A > 0 && B < 0) {
                dAB--;
            }

            if (B < 0 && C > 0) {
                dCB--;
            } else if (B > 0 && C < 0) {
                dCB--;
            }
            if (dAB>dCB) {
                System.out.println(C);
            } else if (dCB>dAB){
                System.out.println(A);
            } else {
                System.out.println("EMPATE");
            }
            nCasos--;
        }
    }
}