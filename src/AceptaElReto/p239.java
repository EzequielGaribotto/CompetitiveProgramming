package AceptaElReto;

import java.util.Scanner;

public class p239 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalDias = scan.nextInt();
        int emisoras = scan.nextInt();
        int horasDia = 24;
        int GTSTime = 6;
        int timeInSeconds, dias, horas, minutos;
        while (totalDias != 0 || emisoras != 0) {
            timeInSeconds = totalDias*GTSTime*emisoras*horasDia;
            dias = timeInSeconds / 86400;
            timeInSeconds %= 86400;

            horas = timeInSeconds / 3600;
            timeInSeconds %= 3600;

            minutos = timeInSeconds / 60;
            timeInSeconds %= 60;
            System.out.printf("%01d:%02d:%02d:%02d\n", dias, horas, minutos, timeInSeconds);
            totalDias = scan.nextInt();
            emisoras = scan.nextInt();
        }
    }
}