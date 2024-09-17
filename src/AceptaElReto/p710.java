package AceptaElReto;

import java.util.*;

public class p710 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nCasos = scan.nextInt();
        while (nCasos != 0) {
            System.out.println(scan.nextInt()-scan.nextInt()-scan.nextInt()-scan.nextInt()-scan.nextInt()-scan.nextInt()-scan.nextInt());
            nCasos--;
        }
    }
}