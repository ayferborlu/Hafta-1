// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int sayi;
        int i;


        System.out.print("1 ve 100 arası bir sayı girin: ");
        sayi=input.nextInt();

        int sayac= 0;

        for(sayi=2; sayi<=100; sayi++){
            int kontrol=0;
            for(i=2 ; i<sayi; i++){
                if( sayi % i==0){
                    kontrol=1;
                    break;
                }
    }
            if (kontrol==0)
            {
                System.out.print(sayi+ "\n");
                sayac++;
            }
}}}