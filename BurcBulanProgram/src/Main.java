import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gun, ay;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz günü girin: ");
        gun = input.nextByte();
        System.out.print("Doğduğunuz ay ı girin: ");
        ay = input.nextByte();

        if ((ay > 0) && (gun < 13)) {
            if (ay == 1) {
            }
            if (gun <= 21) {
                System.out.print("Burcunuz Oğlak");
            } else {
                System.out.print("Burcunuz Kova");
            }


        }
        if (ay == 2) {
            if (gun <= 19) {
                System.out.print("Burcunuz Kova");
            } else {
                System.out.print("Burcunuz Balık");
            }
        }
        if (ay == 3) {
            if (gun <= 20) {
                System.out.print("Burcunuz Balık");
            } else {
                System.out.print("Burcunuz Koç");
            }

        }
        if (ay == 4) {
            if (gun <= 20) {
            }
            System.out.print("Burcunuz Koç");
        } else {
            System.out.print("Burcunuz Boğa");
        }

        if (ay == 5) {
            if (gun <= 21) {
            }
            System.out.print("Burcunuz Boğa");
        } else {
            System.out.print("Burcunuz İkizler");
        }

        if (ay==6) {
            if (gun <= 22) {
            }
            System.out.print("Burcunuz İkizler");
        } else {
            System.out.print("Burcunuz Yengeç ");
        }

        if (ay==7) {
            if (gun <= 23) {
            }
            System.out.print("Burcunuz Yengeç");
        } else {
            System.out.print("Burcunuz Aslan");
        }

        if (ay==8) {
            if (gun <=22) {
            }
            System.out.print("Burcunuz Aslan");
        } else {
            System.out.print("Burcunuz Başak");
        }

        if (ay==9) {
            if (gun <= 22) {
            }
            System.out.print("Burcunuz Başak");
        } else {
            System.out.print("Burcunuz Terazi");
        }

        if (ay==10) {
            if (gun <= 22) {
            }
            System.out.print("Burcunuz Terazi");
        } else {
            System.out.print("Burcunuz Akrep");
        }

        if (ay==11) {
            if (gun <= 22) {
            }
            System.out.print("Burcunuz Yay");
        } else {
            System.out.print("Burcunuz Oğlak");
        }

        if (ay==12) {
            if (gun <= 22) {
            }
            System.out.print("Burcunuz Oğlak");
        } else {
            System.out.print("Burcunuz Ocak");
        }







}}