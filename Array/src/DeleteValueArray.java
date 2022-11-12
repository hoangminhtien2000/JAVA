import java.util.Scanner;

public class DeleteValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 5, 9, 8, 4};
        System.out.println("\nMang ban dau:");
        System.out.print("Array = [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.print("\t]\n");

        int value, index;
        do {
            System.out.println("Enter value: ");
            value = scanner.nextInt();
            index = Value(arr, value);
            if (index == -1) System.out.println("Value is Exist. Please, Enter again.");
        } while (index == -1);
        int[] arrnew = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < index) arrnew[i] = arr[i];
            else arrnew[i] = arr[i + 1];
        }
        System.out.println("\nMang sau khi xoa:");
        System.out.print("Array = [");
        for (int i = 0; i < arrnew.length; i++) {
            System.out.print("\t" + arrnew[i]);
        }
        System.out.print("\t]\n");
    }

    public static int Value(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}