package java101.odev;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz: ");
        yil = scan.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.println(yil + " bir artik yildir!");
            } else {
                System.out.println(yil + " bir artik yil gedildir!");
            }
        } else if (yil % 4 == 0) {
            System.out.println(yil + " bir artik yildir!");
        } else {
            System.out.println(yil + " bir artik yil gedildir!");
        }
    }
}
