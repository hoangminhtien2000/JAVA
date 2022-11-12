import java.util.Scanner;

public class KtraSnt {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        int dem=0;
        int i = 1;
        while (i <=n) {
            if(n%i==0){
                dem++;
            }
            i++;
        }
        if(dem==2){
            System.out.printf("%d is a price",n);
        }
        else {
            System.out.printf("%d is not a price",n);
        }
    }
}
