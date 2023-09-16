             /*       *
                     ***
                    *****
                   *******
                  *********
                   *******
                    *****
                     ***
                      *

              */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        int  n;
        System.out.print("Bir sayı girin: ");
        n=input.nextInt();

        for (int satir = 0; satir < n; satir++) {
            System.out.print(satir+" ");


            for (int sutun = n; sutun > satir; sutun--) {
                System.out.print(" ");
            }

            for (int sutun = 0; sutun <= satir; sutun++) {
                System.out.print("*");
            }

            for (int sutun = 0; sutun < satir; sutun++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }







        for (int satir = 0; satir < n; satir++) {
            System.out.print(satir+" ");


            for (int sutun = 0; sutun < satir; sutun++) {
                System.out.print(" ");
            }


            for (int sutun = n; sutun > satir; sutun--) {
                System.out.print("*");
            }


            for (int sutun = n; sutun > satir; sutun--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }








    }}