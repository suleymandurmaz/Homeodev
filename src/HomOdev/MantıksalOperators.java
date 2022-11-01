package HomOdev;

public class MantıksalOperators {
    public static void main(String[] args) {
        int yas = 28;
        if (yas >= 18) {
            System.out.println("kısi yetişkin");
        } else {
            System.out.println("degil");
        }
        //18 den kucuk ve 70 den büyük
        if (yas < 18 | yas > 70) {
            System.out.println("sosyal yardım alabilir");
        } else if (yas >= 70) {
            System.out.println("sosyal yardım alabilir");
        } else {
            System.out.println("sosyal yardım alamaz");
        }
    }
}
