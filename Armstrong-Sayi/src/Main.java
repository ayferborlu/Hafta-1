import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int number = input.nextInt();
        int tempnumber = 0;
        int basvalue;
        int toplam = 0;

        tempnumber = number;
        while (tempnumber != 0) {
            basvalue = tempnumber % 10;
            tempnumber /= 10;
            toplam += basvalue;
        }
        System.out.println(toplam);
    }
}
