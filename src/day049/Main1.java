package day049;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main1 {
    public static void main(String[] args) {
        String fileName = "files/metin2.txt";

        try {
            FileReader fr = new FileReader(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("hata olustu=" + e.getMessage());

        }
    }
}





