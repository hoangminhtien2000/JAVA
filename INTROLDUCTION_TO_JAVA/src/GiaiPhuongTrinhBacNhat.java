import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        System.out.println("Giai phuong trinh a*x+b=0 ");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a= ");
        a=scanner.nextFloat();
        System.out.println("Enter b= ");
        b=scanner.nextFloat();

        if(a==0){
                if(b!=0){
            System.out.println("Phuong trinh vo nghiem");
            }
            else{
                System.out.println("Phuong trinh co vo so nghiem");
            }
        }
        else {
        double x = -b/a;
        System.out.printf("Phuong trinh co ngiem x = %f\n", x);
        }
    }
}
