package AceptaElReto;

import java.util.*;

public class p678 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabraSecreta;
        while (true) {
            palabraSecreta = scan.next();
            if (palabraSecreta.equals(".")) break;
            System.out.println(msg(palabraSecreta, scan.next()));
        }
    }

    static String msg(String palabraSecreta, String letrasPropuestas) {

        int fallos = 0;
        HashSet<Character> pSecreta = new HashSet<>();
        HashSet<Character> chUsados = new HashSet<>();
        for (char c : palabraSecreta.toCharArray()) pSecreta.add(c);

        for (char c : letrasPropuestas.toCharArray()) {
            if (chUsados.contains(c)) continue;
            if (!pSecreta.contains(c)) fallos++;
            else pSecreta.remove(c);
            if (pSecreta.isEmpty()) return "SALVADO";
            if (fallos == 7) return "AHORCADO";
            chUsados.add(c);
        }

        return "COLGANDO";
    }
}
