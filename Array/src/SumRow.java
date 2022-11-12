import java.util.Scanner;

public class SumRow {
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
            System.out.print("\n");
            for (int j = 0; j < Column; j++) {
                System.out.print("\t" + array[i][j]);
            }
        }
        System.out.print("\t]\n");

        int inputColumn;
        System.out.println("Enter Column Sum:");
        inputColumn=scanner.nextInt();
        int sum=0;
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Column; j++) {
                if(j==inputColumn)   sum+=array[i][inputColumn];
            }
        }
        System.out.printf("Sum Row %d= %d",inputColumn,sum);
    }
}
