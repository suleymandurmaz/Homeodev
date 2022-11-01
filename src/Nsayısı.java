import java.util.Scanner;

public class Nsayısı {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi adedini giriniz : ");
        int sayiAdedi = scanner.nextInt();
        int [] sayilar = new int[sayiAdedi];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(i +1+ ". Sayi : ");
            sayilar[i] = scanner.nextInt();
        }
        int minSayi = sayilar[0];
        int maxSayi = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > maxSayi){
                maxSayi=sayilar[i];
            }
            if (sayilar[i] < minSayi){
                minSayi=sayilar[i];
            }*/

        //System.out.println("En buyuk sayi = " +maxSayi);
        // System.out.println("En kucuk sayi = "+minSayi);
        Scanner input = new Scanner(System.in);
        System.out.print("sayı adedi giriniz");
        int sayiAdedi = input.nextInt();

        System.out.print("n1 giriniz=");
        int n1 = input.nextInt();
        System.out.print("n2 giriniz=");
        int n2 = input.nextInt();
        System.out.print("n3 giriniz=");
        int n3 = input.nextInt();
        System.out.print("n4 giriniz=");
        int n4 = input.nextInt();
        System.out.print("n5 giriniz=");
        int n5 = input.nextInt();
        int[] sayilar = {n1, n2, n3, n4, n5};
        int max = n1;
        int min = n1;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];

            } else if (sayilar[i] < min) {

                min = sayilar[i];
            }


        }
        System.out.println("Max sayı:" + max);
        System.out.println("Min sayı:" + min);
    }

}





