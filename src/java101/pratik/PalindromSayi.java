package java101.pratik;

public class PalindromSayi {
    public static void main(String[] args) {
        System.out.println(isPalindrom(242));
    }

    static boolean isPalindrom(int num) {
        int temp = num, reverseNum = 0, lastNum;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        if (reverseNum == num) {
            return true;
        }
        else
            return false;
    }
}
