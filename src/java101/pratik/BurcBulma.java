package java101.pratik;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month, day;

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = scan.nextInt();
        System.out.print("Doğduğunuz gun: ");
        day = scan.nextInt();

        if (month == 1) {
            if (day <= 22) {
                System.out.println("Oglak burcu");
            } else {
                System.out.println("Kova burcu");
            }
        } else if (month == 2) {
            if (day <= 19) {
                System.out.println("Kova burcu");
            } else {
                System.out.println("Balik burcu");
            }
        } else if (month == 3) {
            if (day <= 20) {
                System.out.println("Balik burcu");
            } else {
                System.out.println("Koc burcu");
            }
        } else if (month == 4) {
            if (day <= 20) {
                System.out.println("Koc burcu");
            } else {
                System.out.println("Boga burcu");
            }
        } else if (month == 5) {
            if (day <= 21) {
                System.out.println("Boga burcu");
            } else {
                System.out.println("Ikizler burcu");
            }
        } else if (month == 6) {
            if (day <= 22) {
                System.out.println("Ikizler burcu");
            } else {
                System.out.println("Yengec burcu");
            }
        } else if (month == 7) {
            if (day <= 22) {
                System.out.println("Yengec burcu");
            } else {
                System.out.println("Aslan burcu");
            }
        } else if (month == 8) {
            if (day <= 22) {
                System.out.println("Aslan burcu");
            } else {
                System.out.println("Basak burcu");
            }
        } else if (month == 9) {
            if (day <= 22) {
                System.out.println("Basak burcu");
            } else {
                System.out.println("Terazi burcu");
            }
        } else if (month == 10) {
            if (day <= 22) {
                System.out.println("Terazi burcu");
            } else {
                System.out.println("Akrep burcu");
            }
        } else if (month == 11) {
            if (day <= 21) {
                System.out.println("Akrep burcu");
            } else {
                System.out.println("Yay burcu");
            }
        } else if (month == 12) {
            if (day <= 21) {
                System.out.println("Yay burcu");
            } else {
                System.out.println("Oglak burcu");
            }
        } else
            System.out.println("Gecerli bir tarih giriniz.");
    }
}

