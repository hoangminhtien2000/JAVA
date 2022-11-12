import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 7, 11, 6, 12};
        System.out.println("\nMang ban dau:");
        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.print("\t]\n");
        System.out.println("Enter value:");
        int value = scanner.nextInt();
        System.out.println("Enter index:");
        int index = scanner.nextInt();
        int[] arraynew= new int[array.length+1];
        for (int i = 0; i < arraynew.length; i++) {
            if (i<index) arraynew[i]=array[i];
            if (i==index) arraynew[i]=value;
            if (i>index) arraynew[i]=array[i-1];
        }

        System.out.println("\nMang sau khi them:");
        System.out.print("Array = [");
        for (int i = 0; i < arraynew.length; i++) {
            System.out.print("\t" + arraynew[i]);
        }
        System.out.print("\t]\n");
    }
}
