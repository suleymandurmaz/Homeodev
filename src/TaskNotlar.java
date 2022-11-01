import java.util.Scanner;

public class TaskNotlar {
    public static void main(String[] args) {
        int ogrenciSayisi = 5;
        int not;
        double toplam = 0;
        double ort;
        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.print(i + "nci ogrencı notu= ");
            Scanner input = new Scanner(System.in);
            not = input.nextInt();
            toplam += not;
        }
        ort = (double) toplam / ogrenciSayisi;
        System.out.printf("not ort= %5.2f", ort);
    }
}
