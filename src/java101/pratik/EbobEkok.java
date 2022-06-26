package java101.pratik;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int buyuk;
        int kucuk;
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int num1 = scan.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            buyuk = num1;
            kucuk = num2;
        } else {
            buyuk = num2;
            kucuk = num1;
        }
        int ebob = 0;
        for (int i = kucuk; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                ebob = i;
                System.out.println("ebob: " + ebob);
                break;
            }
        }
        int ekok = (num1*num2)/ebob;
        System.out.println("ekok: "+ekok);
    }
}
