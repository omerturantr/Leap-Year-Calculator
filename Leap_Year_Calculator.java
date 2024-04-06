import java.util.Scanner;

class Leap_Year_Calculator {
    public static void main(String[] args) {

        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year: ");     year = input.nextInt();

        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(year + " is a LEAP YEAR.");
                }
                else {
                    System.out.println(year + " is not a LEAP YEAR.");
                }
            }
            else {
                System.out.println(year + " is a LEAP YEAR.");
            }
        }
        else {
            System.out.print(year + " is not a LEAP YEAR.");
        }
    }
}
