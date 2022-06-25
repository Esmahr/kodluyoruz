package java101.odev;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double mesafeBasinaUcret = 0.10;

        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km olrak yazini: ");
        mesafe = scan.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas = scan.nextInt();
        System.out.print("1.Tek yon\n2.Gidis-Donus\nYolculuk tipini giriniz(1 veya 2): ");
        yolculukTipi = scan.nextInt();
        double indirim;

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double tutar = mesafe * mesafeBasinaUcret;
            if (yas < 12) {
                indirim = tutar * 0.50;
                tutar = tutar - indirim;
                if (yolculukTipi == 2) {
                    indirim = tutar * 0.20;
                    tutar = tutar - indirim;
                    System.out.println("Tutar: " + tutar);
                } else {
                    System.out.println("Tutar: " + tutar);
                }
            }
            if (yas > 12 && yas < 24) {
                indirim = tutar * 0.10;
                tutar = tutar - indirim;
                if (yolculukTipi == 2) {
                    indirim = tutar * 0.20;
                    tutar = tutar - indirim;
                    System.out.println("Tutar: " + tutar);
                } else {
                    System.out.println("Tutar: " + tutar);
                }
            }
            if (yas > 65) {
                indirim = tutar * 0.30;
                tutar = tutar - indirim;
                if (yolculukTipi == 2) {
                    indirim = tutar * 0.20;
                    tutar = tutar - indirim;
                    System.out.println("Tutar: " + tutar);
                } else {
                    System.out.println("Tutar: " + tutar);
                }
            } else {
                if (yolculukTipi == 2) {
                    indirim = tutar * 0.20;
                    tutar = tutar - indirim;
                    System.out.println("Tutar: " + tutar);
                } else {
                    System.out.println("Tutar: " + tutar);
                }
            }
        } else
            System.out.println("Hatali Veri Girdiniz!");
    }
}
