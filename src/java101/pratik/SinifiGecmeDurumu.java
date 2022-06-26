package java101.pratik;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = scan.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();

        double sum = 0;
        double counter = 0;

        if (matematik > 0 && matematik < 100) {
            sum += matematik;
            counter++;
        }
        if (fizik > 0 && fizik < 100) {
            sum += fizik;
            counter++;
        }
        if (turkce > 0 && turkce < 100) {
            sum += turkce;
            counter++;
        }
        if (kimya > 0 && kimya < 100) {
            sum += kimya;
            counter++;
        }
        if (muzik > 0 && muzik < 100) {
            sum += muzik;
            counter++;
        }
        double avarage = sum/counter;
        if (avarage >= 55) {
            System.out.println("Ortalamaniz:" + avarage + "\nTebrikler gectiniz!");
        } else {
            System.out.println("Ortalamaniz:" + avarage + "\nSinifta kaldiniz!");
        }
    }
}
