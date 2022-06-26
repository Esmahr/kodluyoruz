package java101.odev;

import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int num = scan.nextInt();
        for (int i = 1; i < num; i++) {
            if ((num % i) == 0) {
                toplam += i;
            }
        }
        if (toplam == num) {
            System.out.println(num + " sayisi mukemmel sayidir.");
        } else {
            System.out.println(num + " sayisi mukemmel sayi degildir.");
        }
    }
}
