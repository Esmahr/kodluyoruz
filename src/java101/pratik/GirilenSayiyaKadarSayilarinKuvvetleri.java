package java101.pratik;

import java.util.Scanner;

public class GirilenSayiyaKadarSayilarinKuvvetleri {
    public static void main(String[] args) {
        // Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program.
        int input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        input = scan.nextInt();
        for (int i = 1; i < input; i *= 2) {
            System.out.print(i + " ,");
        }
        System.out.print("\b\n");

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program.
        int in;
        System.out.print("Sayi giriniz: ");
        in = scan.nextInt();
        for (int i = 1; i < in; i *= 4) {
            System.out.print(i + " ,");
        }
        System.out.print("\b\n");
        for (int i = 1; i < in; i *= 5) {
            System.out.print(i + " ,");
        }
        System.out.print("\b");
    }
}
