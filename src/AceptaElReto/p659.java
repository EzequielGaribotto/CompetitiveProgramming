package AceptaElReto;

import java.util.Scanner;

public class p659 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerin = scan.nextInt();
        while (numerin != 0) {
            while (numerin >= 1000000) {
                System.out.print("H");
                numerin -= 1000000;
            }
            while (numerin >= 100000) {
                System.out.print("R");
                numerin -= 100000;
            }
            while (numerin >= 10000) {
                System.out.print("D");
                numerin -= 10000;
            }
            while (numerin >= 1000) {
                System.out.print("F");
                numerin -= 1000;
            }
            while (numerin >= 100) {
                System.out.print("C");
                numerin -= 100;
            }
            while (numerin >= 10) {
                System.out.print("G");
                numerin -= 10;
            }
            while (numerin >= 1) {
                System.out.print("T");
                numerin -= 1;
            }
            System.out.println();
            numerin = scan.nextInt();
        }
    }
}