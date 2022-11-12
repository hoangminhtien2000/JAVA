import java.util.Scanner;

public class FoundMinArray2Chieu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][]array ;
        int Row,Column;
        do {
            System.out.println("\nEnter Row: ");
            Row = scanner.nextInt();
            System.out.println("Enter Column: ");
            Column = scanner.nextInt();
            if (Row > 10 || Row <= 0||Column > 10 || Column <= 0) System.out.println("Enter again");
        } while (Row > 10 || Row <= 0||Column > 10 || Column <= 0);
        array=new int[Row][Column];

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                System.out.printf("array[%d][%d]= ", i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMang ban dau:");
        System.out.print("[");
        for (int i = 0; i < Row; i++) {
            System.out.print("[");
            for (int j = 0; j < Column; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.print("],");
        }
        System.out.print("\t]\n");

        int min=array[0][0];
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                if(array[i][j]<min)
                    min=array[i][j] ;
            }
        }
        System.out.println("Min matrix: "+min);
    }
}
