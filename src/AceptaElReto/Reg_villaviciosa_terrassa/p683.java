package AceptaElReto.Reg_villaviciosa_terrassa;

import java.util.Arrays;
import java.util.Scanner;

public class p683 {
    static int getMinDistance(int[] arr, int from, int to) {
        int minDistance = Integer.MAX_VALUE;
        int localMinDist = 0;
        boolean buscando = false;

        for (int j : arr) {
            if (j == from) {
                localMinDist = 0;
                buscando = true;
            }
            if (j == to && buscando) {
                minDistance = Math.min(minDistance, localMinDist);
                buscando = false;
            }
            if (buscando) localMinDist++;
        }

        return minDistance;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int n = scan.nextInt();
            if (n == 0) break;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                arr[i] = num;
                min = Math.min(min, num);
                max = Math.max(max, num);
            }

            int minDist = Integer.MAX_VALUE;
            for (int i= 0; i < n; i++) {
                if (arr[i] == min) {
                    for (int j = i; j < n; j++) {
                        if (arr[j] == max) {
                            minDist = Math.min(minDist,Math.abs(j-i));
                        }
                    }
                } else if (arr[i] == max) {
                    for (int j = i; j < n; j++) {
                        if (arr[j] == min) {
                            minDist = Math.min(minDist,Math.abs(j-i));
                        }
                    }
                }
            }
            // Math.min(getMinDistance(arr, min, max),
            //          getMinDistance(arr, max, min));
            System.out.printf("%d %d %d\n", min, max, minDist);
        }
    }
}