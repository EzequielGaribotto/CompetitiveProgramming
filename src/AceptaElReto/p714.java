package AceptaElReto;

import java.util.*;

public class p714 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int teamsAmount = scan.nextInt();
        while (teamsAmount > 0) {
            List<String> teams = new ArrayList<>();
            for (int i = 0; i < teamsAmount; i++) {
                teams.add(scan.next());
            }
            while (teamsAmount > 1) {
                List<String> currentWinners = new ArrayList<>();
                for (int i = 0; i < teamsAmount; i += 2) {
                    if (scan.nextInt() > scan.nextInt()) {
                        currentWinners.add(teams.get(i));
                    } else {
                        currentWinners.add(teams.get(i + 1));
                    }
                }
                teamsAmount /= 2;
                teams = currentWinners;
            }
            System.out.println(teams.get(0));
            teamsAmount = scan.nextInt();
        }
    }
}