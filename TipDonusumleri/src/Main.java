import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamsayi;
        double ondaliksayi;
        System.out.print("Lütfen bir tamsayı girin: " );
        tamsayi=input.nextInt();
        System.out.print("Lütfen bir ondalıklı sayı girin: ");
        ondaliksayi= input.nextDouble();

        int tamsayiyacevir= (int) ondaliksayi;
        double ondaliksayiyacevir=(double)tamsayi;

        System.out.println("Tam sayı olarak girilen değerin ondalıklı sayı hali: "+ (double)tamsayi);
        System.out.println("Ondalıklı sayı olarak girilen sayının tam sayı hali: "+tamsayiyacevir );



    }
}