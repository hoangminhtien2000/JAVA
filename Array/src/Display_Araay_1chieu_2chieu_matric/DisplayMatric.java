package Display_Araay_1chieu_2chieu_matric;

import java.util.Scanner;

public class DisplayMatric {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array;
        int Row, Column;
//--------------------------------------------Số lượng phần tử trong ma trận-------------------------------------------
        do {
            System.out.println("\nEnter Row: ");
            Row = scanner.nextInt();
            System.out.println("Enter Column: ");
            Column = scanner.nextInt();
            if (Row > 10 || Row <= 0 || Column > 10 || Column <= 0) System.out.println("Enter again");
        } while (Row > 10 || Row <= 0 || Column > 10 || Column <= 0);
        array = new int[Row][Column];
//--------------------------------------------Nhập các phần tử của ma trận-------------------------------------------
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.printf("array[%d][%d]= ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
//--------------------------------------------Hiển thị ma trận------------------------------------------------------
        System.out.printf("\nMatrix %d x %d:",Row,Column);
        System.out.print("\n[");
        for (int i = 0; i < Row; i++) {
            System.out.print("\n");
            for (int j = 0; j < Column; j++) {
                System.out.print("\t" + array[i][j]);
            }
        }
        System.out.print("\t]\n");
    }
}
