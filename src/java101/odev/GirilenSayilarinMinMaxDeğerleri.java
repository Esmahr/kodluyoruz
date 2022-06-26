package java101.odev;

import java.util.Scanner;

public class GirilenSayilarinMinMaxDeğerleri {
    public static void main(String[] args) {
        int max = 1, min = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayi gireceksiniz: ");
        int in = scan.nextInt();

        for (int i = 1; i <= in; i++) {
            System.out.print(i + ". sayiyi giriniz: ");
            int number = scan.nextInt();

            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("max: " + max + "\nmin: " + min);
    }
}
