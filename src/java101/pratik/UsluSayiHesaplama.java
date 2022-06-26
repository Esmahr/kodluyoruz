package java101.pratik;

import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int num, num1, carpim;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        num = scan.nextInt();
        System.out.print("Ust sayiyi giriniz: ");
        num1 = scan.nextInt();
        carpim = num;
        for (int i = 1; i < num1; i++) {
            carpim *= num;
        }
        System.out.println(num + " sayisinin " + num1 + ". ustu: " + carpim);
    }
}
