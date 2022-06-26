package java101.pratik;

import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int num = scan.nextInt();
        double toplam = 0.0;
        for (int i = 1; i <= num; i++) {
            toplam += (1.0 / i);
        }
        System.out.println("Girilen sayinin Harmonik seri sonucu: " + toplam);
    }
}
