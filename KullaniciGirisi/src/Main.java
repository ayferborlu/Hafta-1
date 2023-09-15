import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sistemdekiKullaniciAdi = "Ayfer", sistemdekiSifre = "123";

        Scanner input = new Scanner(System.in);


        System.out.print("Kullanıcı Adınızı Girin: ");
        var kullaniciAdi = input.nextLine();

        System.out.print("Şifrenizi Girin: ");
        var sifre = input.nextLine();

        // kullanıcı adı Ayfer ve şifre 123 se giriş yaptınız diyerek giriş yapsın

        if (kullaniciAdi.equals(sistemdekiKullaniciAdi) && sifre.equals(sistemdekiSifre)) {
            System.out.print("Giriş yaptınız");
        }

        //eğer kullanıcı adım Ayfer şifre 123 değilse giriş yapamadınız kullanıcı adı ve şifre hatalıyazsın

        else if (!kullaniciAdi.equals(sistemdekiKullaniciAdi) && sifre.equals(sistemdekiSifre)) {
            System.out.print("Giriş yapamadınız!\n");
            System.out.print("Kullanıcı adı hatalı!\n");
        } else if (kullaniciAdi.equals(sistemdekiKullaniciAdi) && !sifre.equals(sistemdekiSifre)) {
            System.out.print("Giriş yapamadınız!");
            System.out.print("Şifreniz hatalı!");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz: evet or hayır");

            var sifreDegisikligiİstiyorMu = input.nextLine();
            if (sifreDegisikligiİstiyorMu.equals("evet")) {
                System.out.println("Yeni Şifre Girin:");

                var yeniSifre = input.nextLine();


                if (yeniSifre.equals(sistemdekiSifre)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    sistemdekiSifre = yeniSifre;
                    System.out.println("Şifre oluşturuldu");
                }
            }
        } else {
            System.out.println("Kullanıcı adı ve şifre hatalı");
        }


    }

}







