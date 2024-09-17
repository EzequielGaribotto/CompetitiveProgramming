package AceptaElReto;

import java.util.Scanner;

public class p711 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {
            String numeroTicket = scan.next();
            int codigoVerificacion = 0;

            for (int digito = 0; digito < numeroTicket.length(); digito++) {
                if (digito % 2 == 0) {
                    int digitoMenor = 9;
                    for (int digitoDerecha = digito + 1; digitoDerecha < numeroTicket.length(); digitoDerecha++) {
                        if (Character.getNumericValue(numeroTicket.charAt(digitoDerecha)) <= digitoMenor) {
                            digitoMenor = Character.getNumericValue(numeroTicket.charAt(digitoDerecha));
                        }
                    }
                    codigoVerificacion += (Character.getNumericValue(numeroTicket.charAt(digito)) * 3) + digitoMenor;
                } else {
                    int digitoMayor = 0;
                    for (int digitoIzquierda = digito - 1; digitoIzquierda >= 0; digitoIzquierda--) {
                        if (Character.getNumericValue(numeroTicket.charAt(digitoIzquierda)) >= digitoMayor) {
                            digitoMayor = Character.getNumericValue(numeroTicket.charAt(digitoIzquierda));
                        }
                    }
                    codigoVerificacion += (Character.getNumericValue(numeroTicket.charAt(digito)) * 2) + digitoMayor;
                }
            }
            System.out.println(codigoVerificacion);
        }
    }
}