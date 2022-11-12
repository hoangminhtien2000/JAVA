public class SortArray {
    public static int[] Sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {6, 8, 3, 5, 1};
        Sort(array);
        System.out.println("\nMang sau khi sap xep la:");
        System.out.print("Array = [");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }
        System.out.print("\t]\n");
    }
}
