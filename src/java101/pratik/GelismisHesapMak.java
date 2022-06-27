package java101.pratik;

import java.util.Scanner;

public class GelismisHesapMak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Faktoriyel Hesaplama\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap";
        System.out.println(menu);
        int a;
        int b;
        do {
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 0:
                    break;
                case 1:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    System.out.println(sum(a, b));
                    break;
                case 2:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    System.out.println(ext(a, b));
                    break;
                case 3:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    System.out.println(mult(a, b));
                    break;
                case 4:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    System.out.println(div(a, b));
                    break;
                case 5:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    System.out.println(pow(a, b));
                    break;
                case 6:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.println(faktor(a));
                    break;
                case 7:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    System.out.println(mod(a, b));
                    break;
                case 8:
                    System.out.print("1. sayiyi giriniz: ");
                    a = scan.nextInt();
                    System.out.print("2. sayiyi giriniz: ");
                    b = scan.nextInt();
                    calc(a, b);
                    break;

            }
        } while (select != 0);

    }

    static int sum(int a, int b) {
        System.out.print("sonuc: ");
        return (a + b);
    }

    static int ext(int a, int b) {
        System.out.print("sonuc: ");
        return (a - b);
    }

    static int mult(int a, int b) {
        System.out.print("sonuc: ");
        return (a * b);
    }

    static int div(int a, int b) {
        System.out.print("sonuc: ");
        return (a / b);
    }

    static int pow(int a, int b) {
        System.out.print(a + " sayisinin " + b + ". üssü: ");

        int sonuc = (int) Math.pow(a, b);
        return sonuc;
    }

    static int faktor(int a) {
        System.out.print(a + " sayisinin faktoriyeli: ");
        for (int i = a - 1; i > 0; i--) {
            a *= a;
        }
        return a;
    }

    static int mod(int a, int b) {
        System.out.print(a + " sayisinin " + b + "ye gore modu: ");
        return a % b;
    }

    static void calc(int a, int b) {
        System.out.println("cevre: " + (2 * (a + b)));
        System.out.println("alan: " + (a * b));
    }
}
