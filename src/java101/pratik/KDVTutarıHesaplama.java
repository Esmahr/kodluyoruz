package java101.pratik;

import java.util.Scanner;

public class KDVTutarıHesaplama {
    public static void main(String[] args) {

        double tutar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz: ");
        tutar = scan.nextDouble();

        double kdvOrani = tutar * 18 / 100;
        double kdv = tutar + kdvOrani;

        System.out.println("KDV'siz fiyat: " + tutar);
        System.out.println("KDV orani: " + kdvOrani);
        System.out.println("KDV'li fiyat: " + kdv);

    }
}
