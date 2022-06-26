package java101.pratik;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Yildiz ucgen");
        for (int i = 1; i <= sayi; i++) {
            for (int j = 0; j <sayi-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Yildiz elmas");
        for (int i = 1; i <= sayi; i++) {
            for (int j = 0; j <sayi-i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = sayi; i >= 1; i--) {
            for (int j = sayi-i ; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
