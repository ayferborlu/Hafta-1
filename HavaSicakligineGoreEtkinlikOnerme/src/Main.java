import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık girin: ");
        sicaklik = input.nextInt();

        if(sicaklik < 5){
            System.out.print("Kayak yapabilrsin.");

        }
        if(sicaklik>=5 && sicaklik <=15){
            System.out.println("Sinemaya gidebilirsin.");

        }
        if(sicaklik<=10 && sicaklik>=10){
            System.out.print("Pikniğe gidebilirsin");
        }
        else {
            System.out.print("Yüzebilirsin.");
        }


    }
}