package java101.pratik;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String  username, password;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanici adiniz: ");
        username = scan.nextLine();

        System.out.print("Sifreniz: ");
        password = scan.nextLine();

        if (username.equals("Patika")&& password.equals("java123")){
            System.out.println("Giris basarili !");
        }
        else
            System.out.println("Bilgileriniz yanlis !");
    }
}
