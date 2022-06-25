package java101;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner scan = new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        double armutKilo = scan.nextDouble();
        System.out.print("Elma kaç kilo? ");
        double elmaKilo = scan.nextDouble();
        System.out.print("Domates kaç kilo? ");
        double domatesKilo = scan.nextDouble();
        System.out.print("Muz kaç kilo? ");
        double muzKilo = scan.nextDouble();
        System.out.print("Patlican kaç kilo? ");
        double patlicanKilo = scan.nextDouble();

        double toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam tutar: " + toplam);
    }
}
