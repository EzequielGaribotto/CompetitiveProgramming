package AceptaElReto.Reg_villaviciosa_terrassa;

import java.util.LinkedList;
import java.util.Scanner;

public class p679 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<String> str = new LinkedList<>();
        LinkedList<String> deleted = new LinkedList<>();
        String current;
        while (n-- > 0) {
            while (true) {
                current = scan.next();
                if (current.equals(".")) break;

                if (current.equals("<")) {
                    if (!str.isEmpty()) {
                        deleted.add(str.getLast());
                        str.removeLast();
                    }
                } else if (current.equals(">")) {

                    if (!deleted.isEmpty()) {
                        str.add(deleted.getLast());
                        deleted.removeLast();
                    } else if (!str.isEmpty()) {
                        str.add(str.getLast());
                    }
                } else {
                    str.add(current);
                    deleted.clear();
                }
            }
            for (int s = 0; s < str.size(); s++) {
                System.out.print(str.get(s));
                if (s != str.size() - 1) System.out.print(" ");
            }
            System.out.println();
            str.clear();
            deleted.clear();
        }
    }
}