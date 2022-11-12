package ManagerEmployee;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerEmployee managerEmployee=new ManagerEmployee();
        while (true) {
            System.out.println("\nQuản lý nhân viên");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Sửa thông tin nhân viên");
            System.out.println("3. Xoá nhân viên");
            System.out.println("4. Hiển thị lương");
            System.out.println("5. Hiển thị thông tin nhân viên");
            System.out.println("6. Thoát");
            System.out.println("\nNhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    managerEmployee.addEmployee1();
                    break;
                case 2:
                    managerEmployee.editInformationEmployee2();
                    break;
                case 3:
                    managerEmployee.deleteEmployee3();
                    break;
                case 4:
                    managerEmployee.showSalary4();
                    break;
                case 5:
                    managerEmployee.showlistEmployee5();
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