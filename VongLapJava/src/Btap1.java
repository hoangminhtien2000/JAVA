import java.util.Scanner;
public class Btap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n=scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i%3==0){
                System.out.printf("%-2d",i);
            }
        }
    }
}
