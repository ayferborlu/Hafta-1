import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        double a;


        Scanner input = new Scanner(System.in);


        System.out.print("Dairenin yarıçapını girin: ");
        r = input.nextInt();

        System.out.print("Merkez Açısının Ölçüsünün Giriniz: ");
        a = input.nextDouble();

        double alan = (pi * (r * r) * a) / 360;
        System.out.print("Dairenin Alanı: " + alan);
    }
}