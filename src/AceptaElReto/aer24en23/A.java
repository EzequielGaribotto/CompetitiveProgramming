
package AceptaElReto.aer24en23;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int c = scan.nextInt();
            int l = scan.nextInt();
            scan.nextLine();

            if (c == 0 && l == 0) {
                break;
            }

            String[] banner = new String[l + 2];
            for (int i = 0; i < l + 2; i++) {
                banner[i] = scan.nextLine();
            }

            char[][] content = new char[l][c];
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    content[i][j] = banner[i + 1].charAt(j + 1);
                }
            }

            // Rotate 90 degrees counterclockwise
            char[][] rotated = new char[c][l];
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    rotated[c - 1 - j][i] = content[i][j];
                }
            }

            for (int i = 0; i < l + 2; i++) {
                System.out.print("-");
            }
            System.out.println();

            for (int i = 0; i < c; i++) {
                System.out.print("|");
                for (int j = 0; j < l; j++) {
                    System.out.print(rotated[i][j]);
                }
                System.out.println("|");
            }

            for (int i = 0; i < l + 2; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}