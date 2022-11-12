package Display_Araay_1chieu_2chieu_matric;

import java.util.Scanner;

public class DisplayArray2chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][]array ;
        int Row,Column;
//--------------------------------------------Số lượng phần tử trong Mảng 2 chiều---------------------------------------
        do {
            System.out.println("\nNhap phan tu mang 2 chieu: ");
            Row = scanner.nextInt();
            System.out.println("Nhap phan tu mang 1 chieu: ");
            Column = scanner.nextInt();
            if (Row > 10 || Row <= 0||Column > 10 || Column <= 0) System.out.println("Enter again");
        } while (Row > 10 || Row <= 0||Column > 10 || Column <= 0);
        array=new int[Row][Column];
//--------------------------------------------Nhập các phần tử vào Mảng 2 chiều---------------------------------------
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.printf("array[%d][%d]= ", i,j);
                array[i][j] = scanner.nextInt();
            }
        }
//--------------------------------------------Hiển thị Mảng 2 chiều----------------------------------------------------
        System.out.println("\nMang ban dau:");
        System.out.print("[\t");
        for (int i = 0; i < Row; i++) {
            System.out.print("[");
            for (int j = 0; j < Column; j++) {
                System.out.print(" " + array[i][j]+" ");
            }
            System.out.print("]\t");
        }
        System.out.print("]\n");
    }
}
