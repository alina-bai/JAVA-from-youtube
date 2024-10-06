
       import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int number;

                System.out.println("Enter a positive number (negative to stop):");

                while (true) { // Infinite loop
                    number = scanner.nextInt(); // Read user input

                    if (number < 0) {
                        break; // Exit the loop if a negative number is entered
                    }

                    System.out.println("You entered: " + number);
                }

                System.out.println("Loop ended because you entered a negative number.");
            }
        }
