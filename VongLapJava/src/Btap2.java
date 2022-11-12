import java.util.Scanner;

public class Btap2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter n: ");
            n = scanner.nextInt();
            ktraSNT(n);
        } while (n != 0);

    }

    public static void ktraSNT(int n) {
        int dem = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                dem++;
            }
        }
        if (dem == 2) {
            System.out.printf("%d is a price\n", n);
        } else {
            System.out.printf("%d is not a price\n", n);
        }
    }
}
