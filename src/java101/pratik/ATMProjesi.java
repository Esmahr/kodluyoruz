package java101.pratik;

import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        int right = 3;
        int balance = 1500;
        int select;

        Scanner in = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Kullanici adinizi giriniz: ");
            String userName = in.nextLine();
            System.out.print("Parolanizi giriniz: ");
            String pass = in.nextLine();

            if (userName.equals("esmahr") && pass.equals("123")) {
                System.out.println("Merhaba, kodluyoruz bankasina hosgeldiniz.");

                do {
                    System.out.print("1-Para yatırma\n2-Para cekme\n3-Bakiye sorgulama\n4-Cikis yap\nLutfen yapmak istediginiz islemi seciniz: ");
                    select = in.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatirmak istediginiz tutar: ");
                            int price = in.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Cekmek istediginiz tutar: ");
                            int price1 = in.nextInt();
                            if (price1 > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price1;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + "\n");
                            break;
                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;
                        default:
                            System.out.println("Gecerli bir deger giriniz:");
                    }
                } while (select != 4);

                break;

            } else {
                --right;

                System.out.print("Hatali kullanici adi veya sifre.");
                if (right == 0) {
                    System.out.println("\nHesabiniz bloke olmustur. Lutfen banka ile iletisime gecin.");
                } else {
                    System.out.print("Tekrar deneyiniz.\nKalan hakkiniz: " + right + "\n");
                }
            }
        }
    }
}
