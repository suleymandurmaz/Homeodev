import java.util.Scanner;

public class MutlakDeger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi: ");
        /*int sayi=input.nextInt();
         *//*int md=sayi;
        if(sayi<0){
            md=-sayi;*/
        System.out.print("bir sayi: ");
        int sayi = input.nextInt();
        int md = sayi;
        md = sayi < 0 ? -sayi : sayi;
        System.out.println("md: " + md);

    }


}

