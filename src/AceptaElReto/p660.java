package AceptaElReto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p660 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        scan.nextLine();

        while (testCases-- > 0) {
            String[] words = scan.nextLine().toLowerCase().split(" ");
            Set<String> pictogramsSet = new HashSet<>();

            for (String word : words) {
                int length = word.length();
                for (int i = 0; i < length; i++) {
                    StringBuilder pictogram = new StringBuilder(String.valueOf(word.charAt(i)));

                    if (i + 1 < length && !esVocal(word.charAt(i)) && esVocal(word.charAt(i + 1))) {
                        pictogram.append(word.charAt(i + 1));
                        i++;

                        if (i + 2 < length) {
                            if (!esVocal(word.charAt(i + 1)) && !esVocal(word.charAt(i + 2))) {
                                pictogram.append(word.charAt(i + 1));
                                i++;
                            }
                        } else if (i + 1 < length && !esVocal(word.charAt(i + 1))) {
                            pictogram.append(word.charAt(i + 1));
                            i++;
                        }
                    }

                    pictogramsSet.add(pictogram.toString());
                }
            }
            System.out.println(pictogramsSet.size());
        }
    }

    private static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}