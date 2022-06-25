package java101;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {

        double boy, kilo;

        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        boy = scan.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = scan.nextDouble();

        double vucutKitleIndeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeks);
    }
}
