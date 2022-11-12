
import java.util.Scanner;

public class FoundValueMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("\nEnter Asset(Billion Dollar): ");
            size = scanner.nextInt();
            if (size > 20 || size <= 0) System.out.println("Enter again");
        } while (size > 20 || size <= 0);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d]= ", i);
            array[i] = scanner.nextInt();
        }

        System.out.println("\nMang ban dau:");
        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.print("\t]\n");

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("Max Asset: " + max + " Billion Dollar," + " Index " + i + "");
            }
        }

    }
}
