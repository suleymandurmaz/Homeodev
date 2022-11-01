package HW004;

public class Main {
    public static void main(String[] args) {
        /*
        Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

   The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes
   from the kilobytes parameter.

   Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".

   XX represents the original value kiloBytes.
   YY represents the calculated megabytes.
   ZZ represents the calculated remaining kilobytes.

   For example, when the parameter kiloBytes is 2500 it needs to print "2500 KB = 2 MB and 452 KB"

   If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
   int convertBytes=kilobytes;
            int megaByte=(convertBytes/1024);
            int remainingKiloByte=(convertBytes%1024);
            System.out.println(convertBytes+" KB="+megaByte+" MB and "+remainingKiloByte+" KB");
         */
        printMegaBytesAndKiloBytes(5000);
        printConversion(75.114);
    }

    public static void printConversion(double kilometers) {
        if (kilometers < 0) {
            System.out.println(" İNVALİD VALUE");
        } else {

            double milesPerhour = Math.round(kilometers / 1.609);
            System.out.println(kilometers + "km/h= " + milesPerhour + "mi/h");
        }
        double number = 1.5;
        long rounded = Math.round(number);
        System.out.println("rounded= " + rounded);
        System.out.println("with 3.9= " + Math.round(3.9));
        System.out.println("with 4.5= " + Math.round(4.4));
        int sum = 45;
        int count = 10;

        double average = (double) sum / count;
        long roundedAverage = Math.round(average);
        System.out.println("average= " + average);
        System.out.println("roundedAverage= " + roundedAverage);
    }

    public static void printMegaBytesAndKiloBytes(int kiloByte) {
        if (kiloByte < 0) {
            System.out.println("Invalit value");
        } else {
            int convertBytes = kiloByte;
            int megaByte = (convertBytes / 1024);
            int remainingKiloByte = (convertBytes % 1024);
            System.out.println(convertBytes + " kb = " + megaByte + " mb and " + remainingKiloByte + " kb");
        }

    }


}
