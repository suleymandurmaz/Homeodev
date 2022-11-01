package HomOdev;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("klavyeden bir metin alarak enter tusuna basın=");
        String metin = input.nextLine();
        try {
            FileWriter fw = new FileWriter("Files/metin.txt", true);
            fw.write(metin);
            fw.close();
            System.out.println("kayıt basarılı");
        } catch (IOException e) {
            System.out.println("bir hata olustu");
        }
        System.out.println(metin);

    }
}
