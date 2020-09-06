import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        //your code goes here
        int totalStudents = a + b + c;
        int divide = totalStudents / 2;
        int divideR = totalStudents % 2;
        int desks = divide + divideR;

        //Printing
        System.out.print(desks);

        // closing the scanner object
        scanner.close();
    }
}