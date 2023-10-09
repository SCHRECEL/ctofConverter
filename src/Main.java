import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;


        System.out.println("Enter the temperature in Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 9/5) + 32;
        System.out.println("It is " + fahrenheit + " Degrees in Fahrenhiet.");
    }
}