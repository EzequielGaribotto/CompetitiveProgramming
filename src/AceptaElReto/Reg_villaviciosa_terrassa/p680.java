package AceptaElReto.Reg_villaviciosa_terrassa;
import java.util.Scanner;

public class p680 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int longRecorrido, longAvanzar, retroceso;
        int cnt;
        while (n-- > 0) {
            longRecorrido = scan.nextInt();
            longAvanzar = scan.nextInt();
            retroceso = scan.nextInt();

            cnt = 0;
            if (longAvanzar <= retroceso && longRecorrido > longAvanzar) {
                System.out.println("IMPOSIBLE");
            } else while (longRecorrido > 0) {
                longRecorrido -= longAvanzar;
                cnt++;
                if (longRecorrido <= 0) {
                    System.out.println(cnt);
                } else {
                    longRecorrido += retroceso;
                }
            }
        }
    }
}
