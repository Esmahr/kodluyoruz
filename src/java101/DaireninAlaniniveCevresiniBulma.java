package java101;

import java.util.Scanner;

public class DaireninAlaniniveCevresiniBulma {
    public static void main(String[] args) {
        int r;
        final double pi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yarıçapini giriniz: ");
        r = scan.nextInt();

        double alan = pi * Math.pow(r, 2);
        double cevre = 2 * pi * r;

        System.out.println("Dairenin cevresi: "+cevre+"\n"+ "Dairenin alani: "+alan);
    }
}
