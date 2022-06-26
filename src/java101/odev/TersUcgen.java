package java101.odev;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int in = scan.nextInt();

        for (int i = in; i >= 1; i--) {
            for (int j = in-i ; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i)-1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
