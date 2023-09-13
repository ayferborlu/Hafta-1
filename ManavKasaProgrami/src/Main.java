import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double Armut, Elma, Domates, Muz, Patlican;


        Scanner input = new Scanner(System.in);

        Armut = 2.14;
        Elma = 3.67;
        Domates = 1.11;
        Muz = 0.95;
        Patlican = 5.00;


        System.out.print("Armut kaç kilo?: "  );
        double armutkilo= input.nextDouble();

        System.out.print("Elma kaç kilo?: "  );

        double elmakilo= input.nextDouble();

        System.out.print("Domates kaç kilo?: "  );

        double domateskilo= input.nextDouble();

        System.out.print("Muz kaç kilo?: "  );

        double muzkilo= input.nextDouble();

        System.out.print("Patlıcan kaç kilo?: "  );

        double patlicankilo= input.nextDouble();


        double toplam = (Armut + armutkilo) + (Elma + elmakilo) + (Domates + domateskilo) + (Muz + muzkilo) + (Patlican+ patlicankilo);
        System.out.print("Toplam Tutar: " + toplam);
    }
}