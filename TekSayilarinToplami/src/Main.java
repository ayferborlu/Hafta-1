import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        int toplam=0;
        boolean tek=false;

        Scanner input= new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz: ");
            sayi = input.nextInt();
            if( sayi%4==0){
                toplam=toplam+sayi;
            }
            if(sayi%2==1) {
            tek=true;
            }
        } while (!tek);
        System.out.print("Toplam: "+toplam);



        }}



