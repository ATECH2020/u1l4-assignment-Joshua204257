import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        //
        int hoursR = hours2 - hours1;
        int minutesR = minutes2 - minutes1;
        int secondsR = seconds2 - seconds1;
        int hourConv = hoursR * 3600;
        int minutesConv = minutesR * 60;
        int timeDiff = hourConv + minutesConv + secondsR;

        //Printing.
        System.out.print(timeDiff);

        // closing the scanner object
        scanner.close();
    }
}