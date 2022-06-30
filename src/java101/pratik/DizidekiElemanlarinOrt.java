package java101.pratik;

public class DizidekiElemanlarinOrt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avarage = sum / arr.length;
        System.out.println("Ortalama: " + avarage);

        // Harmonik ortalama

        double[] arr2 = {1, 2, 3, 4, 5};
        double sum2 = 0;
        for (double i = 0; i < arr.length; i++) {
            sum2 += (1 / arr2[(int) i]);
        }
        double harmonik = arr2.length / sum2;
        System.out.println("Harmonik Ortalama: " + harmonik);

    }
}
