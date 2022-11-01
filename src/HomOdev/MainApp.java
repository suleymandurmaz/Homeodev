package HomOdev;

public class MainApp {
    public static void main(String[] args) {


        //1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour.
        //This method needs to return the rounded value of the calculation of type long.
        //
        //If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
        //
        //Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.
        //For conversion and rounding, check the notes in the text below.
        //
        //Examples of input/output:
        //* toMilesPerHour(1.5); → should return value 1
        //* toMilesPerHour(10.25); → should return value 6
        //* toMilesPerHour(-5.6); → should return value -1
        //* toMilesPerHour(25.42); → should return value 16
        //* toMilesPerHour(75.114); → should return value 47
        System.out.println();
        toMilesConverter(25.42);
    }

    public static long toMilesConverter(double kilometersPerhour) {
        if (kilometersPerhour < 0) {
            System.out.println("İnvalid Value");

        } else {
            double milesPerHour = Math.round(kilometersPerhour / 1.609);

            System.out.println(kilometersPerhour + "km/h=  " + milesPerHour + " " + "mi/h");

        }
        return -1;
    }
}
 /*   public static long toMilesPerHour(double kilometerPerhour) {
        long milesPerHour = 0;
        if (kilometerPerhour < 0) {
            System.out.println("invaled value");


        } else {
            milesPerHour = 0;
            milesPerHour = ;

        }


        return Math.round(kilometerPerhour / 1.609) ;*/





