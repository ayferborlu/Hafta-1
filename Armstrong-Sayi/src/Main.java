import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempnumber = 0;
        int basvalue;
        int toplam=0;

        while (tempnumber != 0) {
        tempnumber /= 10;
        basNumber++;
        toplam+=number/10;

    }
    tempnumber = number;
        while( tempnumber != 0){
         basvalue=   tempnumber % 10;
            System.out.println(basvalue);
            tempnumber/= 10;
            toplam+=number/10;


        }










}}
