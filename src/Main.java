import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year"); //typo Emter lol (fixed now) :)
        int year = myScan.nextInt();
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
        //Code segment (all are similar but classify the last digit of the year to different variables):

        int lastDigit; //declares lastDigit as an integer
        lastDigit = year % 10; // finds the last digit of the 4 digit number
        int onesPlace = lastDigit; // declares a variable "onesPlace" and assigns a the value of the lastDigit to it
        year -= lastDigit;
        year /= 10; // line and line above subtract the last digit from the 4 digit number and divide by 10 (removes the last digit)

        //code repeats 4 times (but with different variables than "onesPlace")

        lastDigit = year % 10;
        int tensPlace = lastDigit; //stores the last digit of the modified year in "tensPlace"
        year -= lastDigit;
        year /= 10;
        lastDigit = year % 10;
        int hundredsPlace = lastDigit; //stores the last digit of the modified year in "hundredsPlace"
        year -= lastDigit;
        year /= 10;
        lastDigit = year % 10;
        int thousandsPlace = lastDigit; //stores the last digit of the modified year in "thousandsPlace"
        year -= lastDigit;
        year /= 10;

        //these next 4 lines print out the different variable values (which are different digits from the variable "year")
        System.out.println(thousandsPlace);
        System.out.println(hundredsPlace);
        System.out.println(tensPlace);
        System.out.println(onesPlace);

        /*
         Bad ide- I mean learning opportunities that did not work:
         System.out.println(year % 10000);
         System.out.println(year % 1000);
         System.out.println(year % 100);
         System.out.println(year % 10);

         output:

         Enter a 4 digit year
         1934
         1934
         934
         34
         4
         */
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran