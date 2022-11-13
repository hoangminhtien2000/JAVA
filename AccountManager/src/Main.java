import manager.ManagerAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        while (true) {
            System.out.println("\nQuản lý Account");
            System.out.println("1. Hiển thị list Account:");
            System.out.println("2. Thêm Account mới:");
            System.out.println("3. Sửa Password: ");
            System.out.println("4. Xoá Account:");
            System.out.println("5. Tìm Account:");
            System.out.println("6. Thoát");
            System.out.println("\nNhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerAccount.showlistAccount();
                    break;
                case 2:
                    managerAccount.createAccount();
                    break;
                case 3:
                    managerAccount.editInformationAccount();
                    break;
                case 4:
                    managerAccount.deleteAccount();
                    break;
                case 5:
                    managerAccount.findAccount();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                   break;
            }
        }
    }
}