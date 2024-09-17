package AceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

public class p606 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) break;
            int[] precios = new int[n];
            int[] crecientes = new int[n];

            for (int i = 0; i < n; ++i) {
                precios[i] = scan.nextInt();
            }
            int maxVeces = 1;

            crecientes[0] = 1;
            for (int next = 1; next < n; ++next) {
                int maxVez = 1;
                for (int prev = 0; prev < next; ++prev) {
                    if (precios[prev] < precios[next]) {
                        maxVez = Math.max(maxVez, crecientes[prev] + 1);
                    }
                }
                crecientes[next] = maxVez;
                maxVeces = Math.max(maxVeces,maxVez);
            }
            System.out.println(Arrays.toString(precios));
            System.out.println(Arrays.toString(crecientes));
            System.out.println(maxVeces);
        }
    }
}
