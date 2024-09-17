package AceptaElReto;

import java.util.Scanner;

public class p676 {
    public static void resolverCaso(Scanner sc) {
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int bisCnt = 0;
        int nrmlCnt = 0;

        for (int y = y1 ; y <= y2; y++) {
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                bisCnt++;
            } else {
                nrmlCnt++;
            }
        }
        System.out.println(nrmlCnt + " " + bisCnt);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        while (c != 0) {
            resolverCaso(scanner);
            c--;
        }
        scanner.close();
    }
}

