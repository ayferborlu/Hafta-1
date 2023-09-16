import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi,us,i ;
        int toplam=1;

        Scanner input=new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        sayi=input.nextInt();
        System.out.print("Üs olacak sayı: ");
        us=input.nextInt();



        for(i=us; i>=1; i--) {
            toplam *= sayi;
        }

        System.out.print("Sonuç: " + toplam);
        }


    }
