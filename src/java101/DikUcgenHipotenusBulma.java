package java101;

import java.util.Scanner;

public class DikUcgenHipotenusBulma {

    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner scan = new Scanner(System.in);

        System.out.print("a kenarini giriniz: ");
        a = scan.nextInt();
        System.out.print("b kenarini giriniz: ");
        b = scan.nextInt();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenus: " + c);
    }
}
