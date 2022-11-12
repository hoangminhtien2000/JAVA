import java.util.Scanner;

public class CovertTemperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputChoice=-1;
        while (inputChoice!=0) {
            System.out.println("\n\nMenu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit\n");
            System.out.print("Enter Choice: ");
            inputChoice = scanner.nextInt();

            switch (inputChoice) {
                case 1:
                    double inputCelsius;
                    System.out.print("Enter Temperature: ");
                    inputCelsius = scanner.nextDouble();
                    double Celsius = (inputCelsius - 32) / 1.8;
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius ", inputCelsius, Celsius);
                    break;

                case 2:
                    double inputFahrenheit;
                    System.out.print("Enter Celsius: ");
                    inputFahrenheit = scanner.nextDouble();
                    double Fahrenheit = inputFahrenheit * 1.8 + 32;
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit ", inputFahrenheit, Fahrenheit);
                    break;

                case 3:
                    System.exit(0);

                default:
                    System.out.println("Enter again.");
            }
        }
    }
}
