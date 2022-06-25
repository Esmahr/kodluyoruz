package java101;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total;
        double startPrice = 10;

        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = scan.nextInt();

        total = startPrice + (km * perKm);
        total = (total < 20) ? 20 : total;
        System.out.println("\nToplam tutar: " + total);
    }
}
