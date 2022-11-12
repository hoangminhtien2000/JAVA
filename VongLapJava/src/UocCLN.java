import java.util.Scanner;

public class UocCLN {
    public static void main(String[] args) {
        int a, b, Ucln = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc chung lon nhat");
        } else {
            int i = 1;
            while (i <= a) {
                if (a % i == 0 && b % i == 0) {
                    if (i > Ucln) {
                        Ucln = i;
                    }
                }
                i++;
            }


            System.out.printf("Uoc chung lon nhat cua %d va %d la: %d", a, b, Ucln);
        }

    }
}
