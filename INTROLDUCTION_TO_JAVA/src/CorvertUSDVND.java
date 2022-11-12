import java.util.Scanner;
public class CorvertUSDVND {
    public static void main(String[] args) {
    int USD;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        USD= scanner.nextInt();
        int VND=USD*23000;
        System.out.printf("%d USD = %d VND",USD,VND);
    }
}
