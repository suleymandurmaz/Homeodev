import java.util.Scanner;

public class HW003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vizeNot, finalNot;
        double ortalama;
        String durum = "";
        System.out.print("Vize Notunuzu Girin=");
        vizeNot = input.nextInt();
        System.out.print("Final Notunuzu Girin : ");
        finalNot = input.nextInt();
        ortalama = vizeNot * 0.4 + finalNot * 0.6;


        char notHarf = ortalama < 60 ? 'F' : ortalama < 70 ? 'D' : ortalama < 80 ? 'C' : ortalama < 90 ? 'B' : ortalama < 100 ? 'A' : 'G';
        System.out.println("Ortalama : " + ortalama + "--->" + notHarf);


    }

}
