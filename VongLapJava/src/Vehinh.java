import java.util.Scanner;

public class Vehinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nMenu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for (int i = 5; i >= 1; i--) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <=i ; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    String st="";
                    for (int i = 1; i <=5 ; i++) {
                        st += "*";
                        System.out.print(st);
                        System.out.print("\n");
                    }
                    System.out.print("\n");

                    for( int i = 1;i <= 5;i++){
                        for( int j = 4;j >= i; j--){
                            System.out.print(" ");
                        }
                        for(int  j = 1;j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.print("I can not do it!\n");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
