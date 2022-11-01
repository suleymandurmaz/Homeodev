package HomOdev;

import java.util.Scanner;

public class odev3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sıcaklık degeri giriniz1= ");
        int sıcaklıkDegeri = input.nextInt();

        System.out.println("sıcaklık degişim uygulaması");

        System.out.println("--");
        System.out.println("1. c derece Hesapla");
        System.out.println("2. f derece Hesapla");
        System.out.print("Seçiminiz: ");
        int secim = input.nextInt();
        System.out.println();
        switch (secim) {
            case 1:
                double C = (sıcaklıkDegeri - 32) / 1.8;
                System.out.println(C + " " + "C" + "--->" + sıcaklıkDegeri + " " + 'F');
                break;
            case 2:

                Double F = sıcaklıkDegeri * 1.8 + 32;
                System.out.println(F + " " + "F" + "---->" + sıcaklıkDegeri + " " + 'C');

                break;



            /*     System.out.println(sıcaklıkDegeri1);
                int sıcaklıkDegeri2=input.nextInt();
            System.out.println("c--->"+convertCelciusToFahrenheit();
        }
    public static double convertCelciusToFahrenheit(int grade){
        double result=(double)( grade*1.8+32);
        return (grade*1.8+32);*/


        }
    }


}