package HomOdev;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
int sutunSayisi=12;
        int toplam=1;
        int sayi;
        System.out.print("Sayı Gİriniz =");
        sayi = input.nextInt();
        for (int i = 1; i <= sayi; i++) {

                System.out.print("*");

                //tiklanmiyor nedense
             //      System.out.print("*" + "\t"+"");*/

        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız adedi ");
        int yildiz = input.nextInt();
        System.out.print("Sütun adedi ");
        int sutun = input.nextInt();

        for (int i = 0; i < yildiz; i++) {
            System.out.print("*\t");
            if (i % sutun == 0) {
                System.out.print("\n");
            }
        }
    }


}







