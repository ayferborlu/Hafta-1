import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı girin(a sayısı): ");
        a = input.nextInt();
        System.out.print("2. Sayıyı girin(b sayısı): ");
        b = input.nextInt();
        System.out.print("3. Sayıyı girin(c sayısı): ");
        c = input.nextInt();

        if( (a<b) && (a<c) ){
            if(a < c){
                System.out.print("a <b < c");
            }else{
                System.out.print(" a <c < b");
            }
        } else if( (b < a) && (b < c)){
            if(b < c){
                System.out.print("b < a < c");
            }
        }


}}