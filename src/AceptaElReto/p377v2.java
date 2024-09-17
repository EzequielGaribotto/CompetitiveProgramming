package AceptaElReto;

import java.util.Scanner;

public class p377v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String number = scan.next();
            int lastFourDigits = Integer.parseInt(number.substring(Math.max(number.length() - 4, 0)));
            if (isImperfectSquare(lastFourDigits)) {
                System.out.println("IMPERFECTO");
            } else {
                System.out.println("NO SE");
            }
        }
        scan.close();
    }

    public static boolean isImperfectSquare(int lastFourDigits) {
        int lastDigit = lastFourDigits % 16;
        return lastDigit != 0 && lastDigit != 1 && lastDigit != 4 && lastDigit != 9;
    }
}