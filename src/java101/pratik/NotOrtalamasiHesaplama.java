package java101.pratik;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = scan.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        double ortalama = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        String sonuc = (ortalama >= 60) ? "Tebrikler gectiniz" : "Maalesef kaldınız";

        System.out.print("\nNot ortalamanız: " + ortalama);
        System.out.print("  -  " + sonuc);
    }
}
