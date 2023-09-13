import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik notunuz:  ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz:  ");
        fizik=inp.nextInt();

        System.out.print("Kimya notunuz:   ");
        kimya=inp.nextInt();

        System.out.print("Türkçe notunuz:  ");
        turkce=inp.nextInt();

        System.out.print("Tarih notunuz:  ");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuz:  ");
        muzik=inp.nextInt();

        int toplam = (mat+ fizik+ kimya+ turkce+ tarih+ muzik);
        double ortalama = toplam / 6 ;
        System.out.println("Ortalamanız:  "+ ortalama);

        boolean gectimi = ortalama >= 60;

        String resultTexT = gectimi ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println(resultTexT);
    }
}