import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a, b, c, u, cevre ;
        double alan;

        Scanner veri = new Scanner(System.in);
        System.out.print("1. kenarı girin:  ");
        a = veri.nextInt();
        System.out.print("2. kenarı gir: ");
        b = veri.nextInt();
        System.out.print("3.kenarı gir: ");
        c = veri.nextInt();

        u=(a+b+c) / 2;

        cevre = 2 * u;

        alan = Math.sqrt(u * (u-a) * (u-b)* (u-c));

        System.out.print("Üçgenin Alanı "+ alan);


    }
}
