package AceptaElReto;

import java.util.Scanner;

public class p704 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int repes =scan.nextInt();
        while (repes>0){
            int ancho =scan.nextInt();
            int alto =scan.nextInt();
            boolean anchoTrue =false;
            boolean altoTrue =false;
            int cantiColors=scan.nextInt();
            int[] colors =new int[cantiColors];
            for (int i=0; i<cantiColors; i++){
                colors[i]=scan.nextInt();
            }
            if (ancho>alto){
                for (int i=0; i<cantiColors; i++){
                    if (colors[i]>=ancho*2&&!anchoTrue){
                        colors[i]-=colors[i];
                        anchoTrue=true;
                    }
                }
                for (int i=0; i<cantiColors; i++){
                    if (colors[i]>=alto*2&&!altoTrue){
                        colors[i]-=colors[i];
                        altoTrue=true;
                    }
                }
            }else{
                for (int i=0; i<cantiColors; i++){
                    if (colors[i]>=alto*2&&!altoTrue){
                        colors[i]-=colors[i];
                        altoTrue=true;
                    }
                }
                for (int i=0; i<cantiColors; i++){
                    if (colors[i]>=ancho*2&&!anchoTrue){
                        colors[i]-=colors[i];
                        anchoTrue=true;
                    }
                }
            }

            if (anchoTrue&&altoTrue){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
            repes--;
        }
    }
}