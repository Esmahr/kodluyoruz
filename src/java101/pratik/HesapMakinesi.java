package java101.pratik;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int num1, num2, select;
        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        num1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        num2 = scan.nextInt();

        System.out.println("\n1Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
        System.out.print("Yapmak istediğiniz işlemi sacin: ");
        select = scan.nextInt();

        switch (select) {
            case 1:
                System.out.println("\nSonuc: " + num1 + num2);
                break;
            case 2:
                System.out.println("\nSonuc: " + (num1 - num2));
                break;
            case 3:
                System.out.println("\nSonuc: " + num1 * num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("\nsayi sifira bolunemez");
                }
                else{
                System.out.println("\nSonuc: " + num1 / num2);
            }
            break;
            default:
                System.out.println("\ngeçerli bir islem seciniz.");
        }

    }
}
