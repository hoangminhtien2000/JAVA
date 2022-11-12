import java.util.Scanner;

public class YearNhuan {
    public static void main(String[] args) {
        int year;
        boolean leapyear = false;
        System.out.println("Enter year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapyear = true;
                }
            } else {
                leapyear = true;
            }
        }
        if (leapyear==true){
            System.out.printf("Year %d is leap year",year);
        }
        else {
            System.out.printf("Year %d is not leap year",year);
        }
    }
}
