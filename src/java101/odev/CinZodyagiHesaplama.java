package java101.odev;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumYili;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dogum yiliniz: ");
        dogumYili = scan.nextInt();

        int mod = dogumYili % 12;

        switch (mod) {
            case 0:
                System.out.println("Çin Zodyağı Burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz: Kopek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz: Okuz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz: Tavsan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz: Yilan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz: At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz: Koyun");
                break;
            default:
                System.out.println("Gecerli bir tarih giriniz.");
                break;
        }
    }
}
