import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        var sayac = 0;

        // Kişiden 0 dan başlayan bir sayı girmesini istedik, girdiği sayı başta atadığımız sayiya kadar, 1er 1er artsın istedik
        for (int i = 1; i <= sayi; i++) {
            // if ile koşullarımızı belirttik
            if ((i % 3 == 0) && i % 4 == 0) {
                toplam = toplam + i;
                sayac++;
            }
        }
        System.out.print("Ortalama: " + (toplam) / sayac);

    }
}
