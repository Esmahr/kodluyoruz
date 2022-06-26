package java101.pratik;

import java.util.Scanner;

public class ArmstrongSayilar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scan.nextInt();
        int basNum = 0;
        int basamak = 0;
        int temp = sayi;
        int temp1 =sayi;
        int armstrong = 0;

        while (sayi != 0) {
            sayi /= 10;
            basNum++;
        }
        while (temp != 0) {
            basamak = temp % 10;
            armstrong += Math.pow(basamak, basNum);
            temp /= 10;
        }
        if (temp1 == armstrong) {
            System.out.println(temp1 + " sayisi armstrong sayidir.");
        } else {
            System.out.println(temp1 + " sayisi armstrong sayi değildir.");
        }
    }
}
