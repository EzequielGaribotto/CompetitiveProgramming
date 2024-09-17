package AceptaElReto.Reg_villaviciosa_terrassa;
import java.util.HashMap;
import java.util.Scanner;
public class p675 {
    public static Scanner scan = new Scanner(System.in);

    static HashMap<Integer, Integer> minOps = new HashMap<>();
    public static void minOps() {
        for (int i= 0; i < 10000; i++) {
            int n = i;
            int ops = 0;
            while (n > 0) {
                if (n % 10 == 0) {
                    ops += 4;
                } else if (n % 10 == 1) {
                    ops += 2;
                } else {
                    ops += 3;
                }
                n /= 10;
            }
            minOps.put(i, ops);
        }
    }
    public static void main(String[] args) {
        int n;
        while (true) {
            n = scan.nextInt();
            if (n == 0) break;
            int[] arr = new int[n];
            System.out.println(minOps.get(n));
        }


    }
}
