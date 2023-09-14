import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik,turkce,kimya,muzik;

       Scanner input = new Scanner(System.in);

       System.out.print("Matematik Notunuz: ");
       mat = input.nextInt();

       System.out.print("Fizik Notunuz: ");
       fizik = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        var ortalamayaKatilmayacakDersSayisi =0;
        if (mat <0 || mat >100 ){
            mat = 0;
            ortalamayaKatilmayacakDersSayisi++;
        }
        if (fizik <0 || fizik >100 ){
            fizik = 0;
            ortalamayaKatilmayacakDersSayisi++;
        }
        if (turkce <0 || turkce >100 ){
            turkce = 0;
            ortalamayaKatilmayacakDersSayisi++;
        }
        if (kimya <0 || kimya >100 ){
            kimya = 0;
            ortalamayaKatilmayacakDersSayisi++;
        }
        if (muzik <0 || muzik >100 ){
            muzik = 0;
            ortalamayaKatilmayacakDersSayisi++;
        }
        double ortalama = (double) (mat+ fizik+turkce+kimya+muzik ) / (5-ortalamayaKatilmayacakDersSayisi);

        var sonuc = "Geçtiniz";

        if(ortalama <= 55){
             sonuc = "Kaldınız";
       }

        System.out.print("Geçme-Kalman Durumu: "+sonuc +"\nOrtalamanız:"+ortalama);









   }
    }
