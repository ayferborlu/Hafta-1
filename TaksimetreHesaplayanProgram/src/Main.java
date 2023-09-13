import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


public static void main(String[] args) {

    int km;
    double kmbasi = 2.20;
    double total;

    Scanner input = new Scanner(System.in);
    System.out.print("Mesafeyi km cinsinden girin:  ");
    km = input.nextInt();
    total = (km * kmbasi) + 10;

    total = (total < 20)? 20 : total;

    System.out.print("AçılışÜcreti ile beraber toplam tutar: " + total);




}
}
