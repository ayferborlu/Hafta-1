import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç satır olsun: ");
        int n = input.nextInt();

        var yildizSayisi = n;
        for (int i = 0; i < n; i++) {
            // baştaki boşlukları oluşturan for:
            for (int m = 0; m < i; m++) {
                System.out.print(" ");
            }
            // yıldızları basan for:
            for (int j = 0; j <= yildizSayisi; j++) {
                System.out.print("*");
            }
            System.out.println();
            yildizSayisi -= 2;
        }
    }
}