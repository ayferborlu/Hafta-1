import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
             Scanner input= new Scanner(System.in);

        System.out.print("Alınan Tutar:");
                var tutar=input.nextDouble();

                var kdvOran = tutar <=1000 ? 0.18 :0.08;



                double kdvTutari= tutar*kdvOran;
                double toplamtutar= tutar + kdvTutari;
                System.out.println("Alınacak Kdv Tutarı: " +kdvTutari);
                System.out.println("Toplam Tutar: " + toplamtutar);



                }
                }