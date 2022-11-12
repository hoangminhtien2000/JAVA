package Display_Araay_1chieu_2chieu_matric;

import java.util.Scanner;

public class DisplayArray1chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
//--------------------------------------------Số lượng phần tử trong Mảng 1 chiều---------------------------------------
        do {
            System.out.println("\nEnter so phan tu: ");
            size = scanner.nextInt();
            if (size > 30 || size <= 0) System.out.println("Enter again");
        } while (size > 30 || size <= 0);
        array = new int[size];
//--------------------------------------------Nhập các phần tử vào Mảng 1 chiều---------------------------------------
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Array[%d]= ", i);
            array[i] = scanner.nextInt();
        }
//--------------------------------------------Hiển thị Mảng 1 chiều----------------------------------------------------
        System.out.println("\nMang ban dau:");
        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.print("\t]\n");
    }

}
