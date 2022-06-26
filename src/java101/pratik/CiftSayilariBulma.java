package java101.pratik;

import java.util.Scanner;

public class CiftSayilariBulma {
    public static void main(String[] args) {

        int input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        input = scan.nextInt();
        System.out.println("Cift sayilar: ");
        for (int i = 0; i <= input; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\b\b");
    }
}
