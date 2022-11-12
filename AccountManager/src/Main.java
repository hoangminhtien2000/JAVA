import manager.ManagerAccount;
import model.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();
        while (true) {
            System.out.println("\nQuản lý tài khoản");
            System.out.println("1. Hiển thị tài khoản:");
            System.out.println("2. Thêm tài khoản mới:");
            System.out.println("3. Sửa password theo username:");
            System.out.println("4. Xoá tài khoản theo username:");
            System.out.println("5. Tìm tài khoản theo usrername:");
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
                    System.out.println("Mời nhập lại");
                    scanner.nextLine();
            }
        }
    }
}