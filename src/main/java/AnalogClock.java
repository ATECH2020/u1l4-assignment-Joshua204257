import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angle = scanner.nextInt();

        //  your code goes here
        int hours = angle / 30;
        int hourAngle = hours * 30;
        int hourDiff = angle - hourAngle;
        int minutes = hourDiff * 2;
        int degreeMin = minutes * 6;
        System.out.print("The degrees that passed are " + degreeMin);

        // closing the scanner object
        scanner.close();
    }
}