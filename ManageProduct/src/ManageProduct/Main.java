package ManageProduct;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nQuan ly san pham");
            System.out.println("1. Them san pham");
            System.out.println("2. Sua san pham");
            System.out.println("3. Xoa san pham");
            System.out.println("4. Hien thi san pham");
            System.out.println("5. Thoat");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ManagerProduct.addProduct();
                    break;
                case 2:
                    ManagerProduct.edit();
                    break;
                case 3:
                    ManagerProduct.delete();
                    break;
                case 4:
                    System.out.println("\nDanh sach san pham la: ");
                    ManagerProduct.show();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi nhap lai");
            }
        }
    }
}
