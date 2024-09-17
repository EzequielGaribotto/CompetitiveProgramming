package AceptaElReto;

import java.util.Scanner;

public class p640 {
    public static String toBase(int num, int base) {
        StringBuilder result = new StringBuilder();
        int base10Num = num;
        while (base10Num > 0) {
            int remainder = base10Num % base;
            result.append(remainder);
            base10Num /= base;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, d;

        while (true) {
            n = s.nextInt();
            d = s.nextInt();
            if (n == 0 && d == 0) break;
            char[] num = toBase(n,9).toCharArray();
            StringBuilder out = new StringBuilder();
            for (int i = num.length - 1; i >= 0; i--) {
                int digitoActual = Character.getNumericValue(num[i]);
                if (digitoActual >= d) out.insert(0, (digitoActual + 1));
                else out.insert(0, digitoActual);
            }
            System.out.println(out);
        }
    }
}