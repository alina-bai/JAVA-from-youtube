import java.util.Scanner;

public class Mathclass {
    public static void main(String[ ] args) {
        System.out.println("Hello, World!");

        /*double x = 5.14;
        double y = 25;
        double z = Math.max(x, y);
        System.out.println(z); */
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x : ");
        x = scanner.nextDouble();

        System.out.println("Enter side y : ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));
        System.out.println("The hypotenuse is: " +z);

        scanner.close();

    }
}