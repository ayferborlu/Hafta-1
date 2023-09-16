import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Kaç Adet sayı gireceksiniz: ");
        int n = input.nextInt();

        int min =0;
        int max=0;
        int number;

        for (int i =1; i<=n; i++){
            System.out.println(i + " sayıyı giriniz");
             number = input.nextInt();
            if (number < min || min==0){
                min=number;
            }
            if (number>max) {
                max = number;
            }
        }

        System.out.println("Girilen sayılar arasında en küçük sayı : "+min);
        System.out.println("Girilen sayılar arasında en büyük sayı: " +max);

    }
}