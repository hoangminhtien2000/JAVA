package ManagerEmployee;

import java.util.Scanner;

public class ManagerEmployee {
    public  Scanner scanner = new Scanner(System.in);
    public  Employee[] employees = new Employee[0];

     public void show() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public  void addArr(Employee employee) {
        Employee[] newArr =new Employee[employees.length+1];
        for (int i = 0; i < employees.length; i++) {
            newArr[i] = employees[i];
        }
        newArr[newArr.length - 1] = employee;
        employees = newArr;
    }

    public  Employee  createEmployee(boolean isEmployeeFullTime) {
        System.out.println("Nhập thông tin nhân viên: ");
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age =Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        if (isEmployeeFullTime) {
            System.out.println("Nhập hệ số: ");
            double heso = Double.parseDouble(scanner.nextLine());
            Employee employeeFullTime=new EmployeeFullTime(name,age,gender,heso);
            return  employeeFullTime;
        }
        else {
            System.out.println("Nhập số buổi: ");
            int soBuoi = Integer.parseInt(scanner.nextLine());
            Employee employeePartTime=new EmployeePartTime(name,age,gender,soBuoi);
            return  employeePartTime;
        }
    }

    public int Index(Employee[] employee, String value) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getName().equals(value) ) return i;
        }
        return -1;
    }
    public void delete() {
        String name1;
        int index;
        do {
            System.out.println("Nhập tên nhân viên muốn xoá: ");
            name1 = scanner.nextLine();
            index = Index(employees, name1);
            if (index==-1) System.out.println("Tên nhân viên không đúng. Mời nhập lại");
        } while (index==-1);
        System.out.printf("Đã xoá nhân viên '%s' ở vị trí %d của danh sách",employees[index].getName(),index);
        Employee[] arrnew = new Employee[employees.length - 1];
        for (int i = 0; i < employees.length - 1; i++) {
            if (i<index ) arrnew[i] = employees[i];
            else arrnew[i] = employees[i+1];
        }
        employees = arrnew;
        scanner.nextLine();
    }
    public void editEmployee() {
        String name1;
        int index;
        do {
            System.out.println("Nhập tên nhân viên muốn sửa: ");
            name1 = scanner.nextLine();
            index = Index(employees, name1);
            if (index==-1) System.out.println("Tên nhân viên không đúng. Mời nhập lại");
        } while (index==-1);
        System.out.println("\t1. Full time");
        System.out.println("\t2. Part time");
        System.out.println("Nhập loại nhân viên muốn sửa: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                    employees[index]=createEmployee(true);
                break;
            case 2:
                employees[index]=createEmployee(false);
            default:
                break;
        }
        System.out.printf("Đã sửa thông tin nhân viên '%s' ở vị trí %d của danh sách",employees[index].getName(),index);
        scanner.nextLine();
    }
    public String Salary1(){
        String name1;
        int index;
        do {
            System.out.println("Nhập tên nhân viên muốn hiển thị lương: ");
            name1 = scanner.nextLine();
            index = Index(employees, name1);
            if (index==-1  ) System.out.println("Tên nhân viên không đúng. Mời nhập lại");
        } while (index==-1 );
             return "Nhân viên '" +employees[index].getName()+"' có lương:"+employees[index].covertSalary(employees[index].salary());
    }
    public void addEmployee1(){
        System.out.println("\t1. FullTime");
        System.out.println("\t2. PartTime");
        System.out.println("Nhập loại nhân viên muốn thêm:");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            Employee employeeFullTime = createEmployee(true);
            addArr(employeeFullTime);
        } else if (choice == 2) {
            Employee employeePartTime = createEmployee(false);
            addArr(employeePartTime);
        }
    }
    public void editInformationEmployee2(){
        if (employees.length==0) {
            System.out.println("Danh sách không có nhân viên nào! Mời nhập thêm nhân viên.");
            scanner.nextLine();
        }
        else {
            editEmployee();
        }
    }
   public void deleteEmployee3 (){
       if (employees.length==0) {
           System.out.println("Danh sách không có nhân viên nào! Mời nhập thêm nhân viên.");
           scanner.nextLine();
       }
       else {
           delete();
       }
   }
    public void showSalary4 (){
        if (employees.length==0) {
            System.out.println("Danh sách không có nhân viên nào! Mời nhập thêm nhân viên.");
            scanner.nextLine();
        }
        else {
            System.out.println(Salary1());
            scanner.nextLine();
        }
    }
   public void showlistEmployee5 (){
       if (employees.length==0) {
           System.out.println("Danh sách không có nhân viên nào! Mời nhập thêm nhân viên.");
           scanner.nextLine();
       }
       else {
           System.out.println("\nDanh sách nhân viên là: ");
           show();
           scanner.nextLine();
       }
   }
}