package manager;

import model.Account;

import java.util.Scanner;

public class ManagerAccount {
    Scanner scanner = new Scanner(System.in);
    Account[] accounts = new Account[0];

    public void addArr(Account employee) {
        Account[] newArr = new Account[accounts.length + 1];
        for (int i = 0; i < accounts.length; i++) {
            newArr[i] = accounts[i];
        }
        newArr[newArr.length - 1] = employee;
        accounts = newArr;
    }

    public int Index(Account[] accounts, String username) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getUsername().equals(username) ) return i;
        }
        return -1;
    }

    public String Account1(){
        String username;
        int index;
        do {
            System.out.println("Nhập Username muốn tìm: ");
            username = scanner.nextLine();
            index = Index(accounts, username);
            if (index==-1  ) System.out.println("Username không đúng. Mời nhập lại");
        } while (index==-1 );
             return accounts[index].toString();
    }
    public void editAccount(){
        String username;
        int index;
        do {
            System.out.println("Nhập Username của tài khoản muốn sửa: ");
            username = scanner.nextLine();
            index = Index(accounts, username);
            if (index==-1) System.out.println("Username không đúng. Mời nhập lại");
        } while (index==-1);
        System.out.println("Nhập Password mới:");
        String password=scanner.nextLine();
        accounts[index]=new Account(accounts[index].getId(),accounts[index].getUsername(),password,accounts[index].getPhone(),accounts[index].getBirthday());
        System.out.printf("Đã sửa Password của Account có Username '%s' trong danh sách",accounts[index].getUsername());
        scanner.nextLine();
    }
    public void delete() {
        String username;
        int index;
        do {
            System.out.println("Nhập Username của tài khoản muốn xoá: ");
            username = scanner.nextLine();
            index = Index(accounts, username);
            if (index==-1) System.out.println("Username không đúng. Mời nhập lại");
        } while (index==-1);
        System.out.printf("Đã xoá Account có Username '%s' trong danh sách",accounts[index].getUsername());
        Account[] arrnew = new Account[accounts.length - 1];
        for (int i = 0; i < accounts.length - 1; i++) {
            if (i<index ) arrnew[i] = accounts[i];
            else arrnew[i] = accounts[i+1];
        }
        accounts = arrnew;
        scanner.nextLine();
    }
    public void showlistAccount(){
        if (accounts.length==0) {
            System.out.println("Danh sách không có Account nào! Mời thêm Account.");
            scanner.nextLine();
        }
        else {
            System.out.println("\nDanh sách Account là: ");
            for (int i = 0; i < accounts.length; i++) {
                System.out.println(accounts[i].toString());
            }
            scanner.nextLine();
        }
    }
    public void createAccount() {
        System.out.println("Nhập thông tin tài khoản: ");
        System.out.println("Nhập Id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Username: ");
        String username = scanner.nextLine();
        System.out.println("Nhập Password: ");
        String password = scanner.nextLine();
        System.out.println("Nhập Phone Number: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập Birthday: ");
        String birthday = scanner.nextLine();
        Account accounts = new Account(id, username, password, phone, birthday);
        addArr(accounts);
    }
    public void editInformationAccount(){
        if (accounts.length==0) {
            System.out.println("Danh sách không có nhân viên nào! Mời nhập thêm nhân viên.");
            scanner.nextLine();
        }
        else {
            editAccount();
        }
    }
    public void deleteAccount(){
        if (accounts.length==0) {
            System.out.println("Danh sách không có nhân viên nào! Mời nhập thêm nhân viên.");
            scanner.nextLine();
        }
        else {
            delete();
        }
    }
    public void findAccount(){
        if (accounts.length==0) {
            System.out.println("Danh sách không có Account nào! Mời thêm Account.");
            scanner.nextLine();
        }
        else {
            System.out.println(Account1());
            scanner.nextLine();
        }
    }

}
