package java101.odev;

import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        int sayac = 0;
        System.out.print("3, 5, 7, ");
        for (int i = 10; i < 100; i++) {
            if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.print("\b\b");
    }
}
