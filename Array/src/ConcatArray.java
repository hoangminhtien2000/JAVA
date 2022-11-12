import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4];
        int[] array2 = new int[3];
        System.out.println("Enter Array1:");
        for (int i=0;i<array1.length;i++) {
            System.out.printf("Array1[%d]= ",i);
            array1[i]=scanner.nextInt();
        }
        System.out.println("\nEnter Array2:");
        for (int i=0;i<array2.length;i++) {
            System.out.printf("Array2[%d]= ",i);
            array2[i]=scanner.nextInt();
        }

        System.out.print("\nArray1 = [");
        for (int i=0;i<array1.length;i++) {
            System.out.print("\t"+array1[i]);
        }
        System.out.print( "\t]\n");
        System.out.print("\nArray2 = [");
        for (int i=0;i<array2.length;i++) {
            System.out.print("\t"+array2[i]);
        }
        System.out.print( "\t]\n");

        int[]array3=new int[array1.length+ array2.length];
        for (int i = 0; i < array1.length; i++) {
                array3[i]=array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length+i]=array2[i];
        }

        System.out.print("\nArray3 = [");
        for (int i=0;i<array3.length;i++) {
            System.out.print("\t"+array3[i]);
        }
        System.out.print( "\t]");
    }
}
