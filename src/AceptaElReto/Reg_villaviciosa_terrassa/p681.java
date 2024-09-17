package AceptaElReto.Reg_villaviciosa_terrassa;

import java.util.*;

class Color implements Comparable<Color> {
    int cantidad;
    Color(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Color o) {
        return o.cantidad - this.cantidad;
    }
}
public class p681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int n = scan.nextInt();
            ArrayList<Color> colores = new ArrayList<>();
            while (n-- > 0) {
                colores.add(new Color(scan.nextInt()));
            }
            Collections.sort(colores);
            long sum = 0;
            for (int c = 0; c < colores.size(); c++) {
                if (c-1 > -1 && colores.get(c-1).cantidad <= colores.get(c).cantidad) {
                    if (colores.get(c-1).cantidad == 1) break;
                    colores.set(c, new Color(colores.get(c-1).cantidad-1));
                }
                sum+=colores.get(c).cantidad;
            }

            System.out.println(sum);
        }
    }
}