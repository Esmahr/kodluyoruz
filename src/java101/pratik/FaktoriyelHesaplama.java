package java101.pratik;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        int input;
        int faktoriyel = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            faktoriyel *= i;
        }
        System.out.println(input + " sayisinin faktoriyeli: " + faktoriyel);
    }
}
