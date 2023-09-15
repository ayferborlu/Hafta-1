import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen doğduğunuz ayı yazınız");
        String ay=input.next();

        System.out.println("Lütfen doğduğunuz günü yazınız");
        int gun=input.nextInt();

        String burc = "";

        if (ay.equals("Ocak")) {
            if (gun > 22)
                burc = "Kova";
            else
                burc = "Oğlak";
        }


        if (ay.equals("Şubat")) {
            if (gun > 20)
                burc = "Balık";
            else
                burc = "Kova";
        }

        if (ay.equals("Mart")) {
            if (gun > 20)
                burc = "Balık";
            else
                burc = "Koç";


        }
        if (ay.equals("Nisan")) {
            if (gun > 20)
                burc="Koç";
            else
                burc="Boğa";
        }

        if (ay.equals("Mayıs")) {
            if (gun > 21)

                burc= "Boğa";
            else
                burc= "İkizler";
        }

        if (ay.equals("Haziran")) {
            if (gun > 22)
                burc= "İkizler";
            else
                burc="Yengeç ";
        }

        if (ay.equals("Temmuz")) {
            if (gun > 23)

                burc="Yengeç";
            else
                burc="Aslan";
        }

        if (ay.equals("Ağustos")) {
            if (gun > 22)

                burc="Aslan";
            else
                burc=" Başak";
        }

        if (ay.equals("Eylül")) {
            if (gun > 22)

                burc="Başak";
            else
                burc="Terazi";
        }

        if (ay.equals("Ekim")) {
            if (gun > 22)

                burc="Terazi";
            else
                burc="Akrep";
        }

        if (ay.equals("Kasım")) {
            if (gun > 22)

                burc="Akrep";
            else
                burc=" Oğlak";
        }

        if (ay.equals("Aralık")) {
            if (gun > 22)

                burc="Oğlak";
            else
                burc="Yay";
        }

        System.out.println(gun+" "+ay+" "+" gününde doğduysanız burcunuz da "+burc+" olur");


    }
}