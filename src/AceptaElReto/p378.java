package AceptaElReto;

import java.util.*;

public class p378 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int localidades;
        while (true) {
            localidades = scan.nextInt();
            if (localidades == 0) return;
            System.out.println(msg(localidades, scan) ? "SI" : "NO");
        }
    }

    static boolean msg(int nLocalidades, Scanner scan) {
        boolean msg = true;
        int[][] matriz = new int[nLocalidades][2];
        for (int i = 0; i < nLocalidades; i++) {
            matriz[i][0] = scan.nextInt();
            matriz[i][1] = scan.nextInt();
        }

        Arrays.sort(matriz, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) return b[1] - a[1];
                return b[0] - a[0];
            }
        });

        for (int i = 0; i < nLocalidades && msg; i++) {
            for (int j = i+1; j < nLocalidades && msg; j++) {
                if (matriz[i][0] > matriz[j][0]) {
                    msg = matriz[i][1] > matriz[j][1];
                } else {
                    if (matriz[i][0] == matriz[j][0]) {
                        msg = matriz[i][1] <= matriz[j][1];
                    } else {
                        msg = matriz[i][1] < matriz[j][1];
                    }
                }
            }
        }
        return msg;
    }
}