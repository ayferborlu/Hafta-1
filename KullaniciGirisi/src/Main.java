import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String KullaniciAdi, Sifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Girin: ");
        KullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi Girin: ");
        Sifre = input.nextLine();

        if(KullaniciAdi.equals("Java") && Sifre.equals("123")) {
            System.out.print("Giriş Yaptınız");

        }
        else if (Sifre.equals("123")){
        }
        System.out.print("Şifre Yanlış");


    }
}




