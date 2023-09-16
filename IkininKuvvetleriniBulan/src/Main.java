//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int i;
        int sayi;

        Scanner input =new Scanner(System.in);


        System.out.print("Bir sayı giriniz: ");
        sayi=input.nextInt();


        for( i=1; i<=sayi; i*=4);
        System.out.println("4ün kuvvetleri: " + i);

        for( i=1; i<=sayi; i*=5);
        System.out.println("5in kuvvetleri: "+ i);



    }
}