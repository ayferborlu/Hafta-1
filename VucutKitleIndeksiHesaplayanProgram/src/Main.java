import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden girin: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu girin: ");
        kilo = input.nextDouble();

        double vke = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz: " + vke);
        vke= input.nextDouble();





    }
}