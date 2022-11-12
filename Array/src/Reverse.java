import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if (size > 20||size<=0) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20||size<=0);
        array=new int[size];
        for (int i=0;i<array.length;i++) {
            System.out.printf("Array[%d]= ",i);
            array[i]=scanner.nextInt();
        }

        System.out.println( "\nMang ban dau:");
        System.out.print("Array = [");
        for (int i=0;i<array.length;i++) {
            System.out.print("\t"+array[i]);
        }
        System.out.print( "\t]\n");

        int first=0,last= array.length-1,temp;
        while (first<last){
            temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }

        System.out.println( "\nMang sau khi dao nguoc:");
        System.out.print("Array = [");
        for (int i=0;i<array.length;i++) {
            System.out.print("\t"+array[i]);
        }
        System.out.print( "\t]");
    }
}
