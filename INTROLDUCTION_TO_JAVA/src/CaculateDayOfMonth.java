import java.util.Scanner;
public class CaculateDayOfMonth {
    public static void main(String[] args) {
        int day;
        String DaysInMonth;
        System.out.println("Enter Month: ");
        Scanner scanner = new Scanner(System.in);
        day= scanner.nextInt();

        switch (day) {
            case 2:
                DaysInMonth="28 or 29";
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                DaysInMonth="31";
                break;
            case 4: case 6: case 9: case 11:
                DaysInMonth="30";
                break;
            default:
                DaysInMonth="";
        }
        if(!DaysInMonth.equals("")) System.out.printf("The month %d has %s days.",day,DaysInMonth);
        else System.out.println("Invalid input!");
    }
}
