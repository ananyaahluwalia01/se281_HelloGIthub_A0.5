package nz.ac.auckland.softeng281.hellogithub;

public class Basics {

    /**
     * triple operation
     *
     * @param number
     * @return the number 3 times the parameter
     */
    public static int triple(int number) {
        return number * 3;
    }

    /**
     * absolute operation
     *
     * @param number
     * @return the number as a positive only 
     */
    public static double absolute(double number) {
        return Math.abs(number);
    }

    /**
     * minimum operation
     *
     * @param num1
     * @param num2
     * @return the smallest of the two parameters 
     */
    public static int min(int num1, int num2) {
        if (num1 <= num2) {
          return num1;
        } else {
          return num2;
        }
    }


    /**
     * maximum operation
     *
     * @param num1
     * @param num2
     * @return the largest of the two parameters 
     */
    public static int max(int num1, int num2) {
        //TODO implement
        return -1;
    }

    /**
     * rounding operation
     *
     * @param number
     * @return the number rounded to the nearest whole number
     */
    public static int round(double number) {
        //TODO implement
        return -1;
    }

}
