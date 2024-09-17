package AceptaElReto;

import java.util.Scanner;

public class p699 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (line.equals("0")) {
            } else if (!line.contains("x")) {
                System.out.println("0");
            } else {
                String[] words = line.split("\\+");
                StringBuilder result = new StringBuilder();

                for (String w : words) {
                    String[] words2 = w.split("\\^");
                    if (words2.length == 2) {
                        int elevadoA = Integer.parseInt(words2[1]);
                        if (Integer.parseInt(words2[1]) > 2) {
                            result.append(Integer.parseInt(words2[0].replace("x", "")) * elevadoA).append("x^").append(Integer.parseInt(words2[1]) - 1);
                            result.append("+");
                        } else {
                            result.append(Integer.parseInt(words2[0].replace("x", "")) * elevadoA).append("x");
                            result.append("+");
                        }
                    } else {
                        if (words2[0].contains("x")) {
                            if (words2[0].equals("x")) {
                                result.append("1+");
                            } else {
                                result.append(Integer.parseInt(words2[0].replace("x", "")));
                                result.append("+");
                            }
                        }
                    }
                }
                System.out.println(result.substring(0, result.length() - 1));
            }
        }
    }
}
