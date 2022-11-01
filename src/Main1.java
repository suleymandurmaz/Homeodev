import java.io.File;

public class Main1 {
    public static void main(String[] args) {
        File f = null;
        dosyaSil(f);

    }

    public static void dosyaSil(File dosya) {
        try {
            if (dosya.exists()) {
                if (dosya.delete()) {
                    System.out.println("dosya silindi");

                }

            }

        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
