import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int sayi1,sayi2,secim;

    Scanner input = new Scanner(System.in);
    System.out.print("İlk sayıyı girin: ");
    sayi1 = input.nextInt();
    System.out.print("İkinci sayıyı girin: ");
    sayi2= input.nextInt();


    System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
    System.out.print("Seçiniz: ");
    secim = input.nextInt();

    switch (secim) {

        case 1 :
            System.out.print("Toplama Sonucu:" +(sayi1 + sayi2));
            break;

        case 2:
            System.out.print("Çıkarma Sonucu: " +(sayi1 - sayi2));
            break;
        case 4 :
            System.out.print("Çarpım Sonucu: "+(sayi1 * sayi2));
            break;
        case 5 :
            System.out.print("Bölme Sonucu:" +(sayi1 - sayi2));
            break;
        default:
            System.out.print("Hatalı seçim yaptınız");

    }








    }
}