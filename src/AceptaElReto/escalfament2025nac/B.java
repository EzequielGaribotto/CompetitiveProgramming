package AceptaElReto.escalfament2025nac;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < casos; i++) {
            String linea = scan.nextLine();
            StringBuilder plural = new StringBuilder();
            for (int j = 0; j < linea.length(); j++) {
                char c = linea.charAt(j);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    plural.append(c).append(c);
                } else {
                    plural.append(c);
                }
            }
            System.out.println(plural);
        }
    }
}