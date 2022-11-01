import java.util.Scanner;

public class NotlarHarf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("not giriniz:");
        int not = input.nextInt();
        char notHarf = not < 60 ? 'f' : not < 70 ? 'd' : not < 80 ? 'c' : not <= 90 ? 'b' : not > 90 ? 'a' : 'g';
        //System.out.println(not+"--->:"+notHarf);
        System.out.printf("%s--->%s:", not, notHarf);
    }
}
