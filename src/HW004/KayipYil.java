package HW004;

public class KayipYil {
    public static void main(String[] args) {

    }


    public static void isLeapYear(int year) {
        int yil = 2000;
        boolean isLeapYear = false;
        if (year >= 1 | year <= 9999) {
            System.out.println("isnt a leap year");

        } else if (year % 4 == 0 & year % 100 == 0) {
            System.out.println("is a leap year");


        } else if (year % 100 == 0 & year % 400 == 0) {
            System.out.println(year + "is a leap year");


        } else {
            System.out.println(year + "is anot leap year");

        }

        {
        /*
        Write a method isLeapYear with a parameter of type int named year.

   The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

   If the parameter is not in that range return false.

   Otherwise, if it is in the valid range,
   calculate if the year is a leap year and return true if it is a leap year,
   otherwise return false.


   To determine whether a year is a leap year, follow these steps:
   1. If the year is evenly divisible by 4, go to step 2. Otherwise go to step 5.
   2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
   3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
   4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
   5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

   The following years are not leap years:
   1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
   This is because they are evenly divisible by 100 but not by 400.
[15:48]
The following years are leap years:
   1600, 2000, 2400
   This is because they are evenly divisible by both 100 and 400.

   Examples of input/output:

   * isLeapYear(-1600); → should return false since the parameter is not in range (1-9999)

   * isLeapYear(1600); → should return true since 1600 is a leap year

   * isLeapYear(2017); → should return false since 2017 is not a leap year

   * isLeapYear(2000);  → should return true because 2000 is a leap year

   NOTE: The method isLeapYear needs to be defined as public static like we have been doing so far in the course.
       }else if ((year%4==0)&&(year%100!=0)){
        System.out.println(year+" artık yıl");
        return true;
    }else if ((year%100==0)&&(year%400==0)){
        System.out.println(year+" artık yıl");
        return true;
    }else {
        System.out.println(year+" is not a leap year");
    }

        return false;
    }
         */


        }

    }
}



/*
        public static void main(String[] args) {

            int yil;
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir yıl girin:");
            yil = scan.nextInt();
            scan.close();
            boolean artikMi = false;

            if(yil % 4 == 0)
            {
                if( yil % 100 == 0)
                {
                    if ( yil % 400 == 0)
                        artikMi = true;
                    else
                        artikMi = false;
                }
                else
                    artikMi = true;
            }
            else {
                artikMi = false;
            }

            if(artikMi==true)
                System.out.println(yil + " artık bir yıldır.");
            else
                System.out.println(yil + " artık bir yıl değildir.");
        }*/
