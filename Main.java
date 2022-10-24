import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas, yolculukTipi;
        double mesafe, tutar = 0, indirim = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipinizi giriniz\n1 = Tek Yön\n2 = Gidiş-Dönüş");
        yolculukTipi = input.nextInt();
        System.out.print("Gideceğiniz mesafeyi giriniz (KM cinsinden) : ");
        mesafe = input.nextDouble();

        tutar = (mesafe * 0.1);

        if (yas > 0) {
            if (yas < 12){
                indirim = 0.5;
            }else if (yas < 24){
                indirim = 0.1;
            }else if (yas > 65){
                indirim = 0.3;
            }else{
                indirim = 0;
            }

            tutar *= (1 - indirim);

            if (mesafe <= 100){
                System.out.println("İndi Bindi Yapmak Yasak!!");
            }

            switch (yolculukTipi){
                case 1:
                    break;
                case 2:
                    indirim = 0.2;
                    tutar *= 2*(1-indirim);
                    break;
                default:
                    System.out.println("Hatalı veri girdisi !!!");
            }
            System.out.println("Ödenecek Tutar = " + tutar);
        }else {
            System.out.println("Hatalı veri girdisi !!");
        }





    }
}