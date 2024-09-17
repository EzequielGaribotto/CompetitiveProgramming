package AceptaElReto;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class p675 {
    public static boolean todoUnoCeros(String num) {
        for (char c : num.toCharArray()) {
            if (c != '0' && c != '1') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> minOps = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> nOps = new HashMap<>();
        nOps.put(0, new ArrayList<>());
        for (int i = 0; i <= 10000; ++i) {
            if (todoUnoCeros(String.valueOf(i))) {
                minOps.put(i, 0);
                nOps.get(0).add(i);
            }
        }
        int numOps = 1;
        while (minOps.size() <= 10000) {
            nOps.put(numOps, new ArrayList<>());
            for (int i = 0; i < numOps; ++i) {
                for (int j = i; j < numOps; ++j) {
                    if (i + j + 1 > numOps) break;
                    if (i + j + 1 < numOps) continue;
                    for (int elem1 : nOps.get(i)) {
                        for (int elem2 : nOps.get(j)) {
                            if (elem1 + elem2 <= 10000 && !minOps.containsKey(elem1 + elem2)) {
                                minOps.put(elem1 + elem2, numOps);
                                nOps.get(numOps).add(elem1 + elem2);
                            }
                            if (elem1 * elem2 <= 10000 && !minOps.containsKey(elem1 * elem2)) {
                                minOps.put(elem1 * elem2, numOps);
                                nOps.get(numOps).add(elem1 * elem2);
                            }
                        }
                    }
                }
            }
            numOps++;
        }
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            System.out.println(minOps.get(n));
            n = scanner.nextInt();
        }
        scanner.close();
    }
}

