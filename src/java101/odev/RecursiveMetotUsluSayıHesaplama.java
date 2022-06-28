package java101.odev;

import java.util.Scanner;

public class RecursiveMetotUsluSayıHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("taban sayisini giriniz: ");
        int a = scan.nextInt();
        System.out.print("us sayisini giriniz: ");
        int b = scan.nextInt();
        System.out.println("Sonuc: " + us(a, b));

    }

    static int us(int a, int b) {
        int result = 1;
        if (b == 0) {
            return 1;
        } else {
            for (int i = 1; i <= b; i++) {
                result *= a;
            }

            return result;
        }
    }
}
