import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1;
        int sayi2;
        int i =1;





        Scanner input =new Scanner(System.in);
       // sisteme iki sayı girmesini sağlamak için:
        System.out.print("1. Sayıyı girin: ");
        sayi1=input.nextInt();
        System.out.print("2.Sayıyı girin: ");
        sayi2= input.nextInt();
        int ebob=1;
        int ekok =1;

        for( i=1;i<=sayi1;i++){
            if(sayi1 %i==0 && sayi2%i==0) {
                ebob = i;
            }
        }
        System.out.println(ebob);
        System.out.println("EKOK :"+(sayi1 * sayi2)/ebob);


    }

}