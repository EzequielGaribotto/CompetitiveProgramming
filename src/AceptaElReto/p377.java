package AceptaElReto;

import java.math.BigInteger;
import java.util.Scanner;

public class p377 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextBigInteger()) {
            BigInteger num = scan.nextBigInteger();
            char[] num2 = num.toString(16).toCharArray();
            System.out.println(num2);
            switch (num2[num2.length-1]) {
                case '0':
                case '1':
                case '4':
                case '9':
                    System.out.println("NO SE");
                    break;
                default:
                    System.out.println("IMPERFECTO");
                    break;
            }
        }
    }
}