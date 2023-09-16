import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı girin: ");
        int sayi=input.nextInt();
        int a =0;
        int b =1;

        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=3; i<=sayi; i++){
            int c = a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }

    }
}