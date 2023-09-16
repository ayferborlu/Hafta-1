import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        int toplam=0;
        boolean tek;

        Scanner input= new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();

            if( sayi%2==0 &&4==0){
            toplam=toplam+sayi;
                tek=sayi%2==1;


            }
        } while (!tek );
        System.out.print("Toplam: "+toplam);



        }}



