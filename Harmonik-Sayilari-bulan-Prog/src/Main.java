import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("N Sayısını Girin: ");
        int n= input.nextInt();
        double result =0.0;
        double i;

        for(i=1; i<=n; i++){
            result+=(1.0/5);
        }
        System.out.println(result);
    }
}