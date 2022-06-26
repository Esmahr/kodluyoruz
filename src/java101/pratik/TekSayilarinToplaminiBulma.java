package java101.pratik;

import java.util.Scanner;

public class TekSayilarinToplaminiBulma {
    public static void main(String[] args) {
        int input;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz: ");
            input = scan.nextInt();
            if (input % 2 == 1) {
                total += input;
            }
        } while (input > 0);
        System.out.println("Toplam: "+total);
    }
}
