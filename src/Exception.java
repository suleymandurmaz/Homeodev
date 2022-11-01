

import java.io.File;

public class Exception {

    public static void main(String[] args) {
        String fileName = "files\\metin2.txt";

        System.out.println("dosya mevcut" + fileName);
        File f = new File(fileName);
        if (f.exists()) {
            System.out.println("dosya var");
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.getName());

        } else {
            System.out.println("boyle bir dosya yok");
        }

    }
}
