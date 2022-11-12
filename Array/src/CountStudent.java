import java.util.Scanner;

public class CountStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] students;
        do {
            System.out.println("\nEnter Student: ");
            size = scanner.nextInt();
            if (size > 30 || size <= 0) System.out.println("Enter again");
        } while (size > 30 || size <= 0);
        students = new int[size];
        for (int i = 0; i < students.length; i++) {            
            System.out.printf("Students[%d]= ", i);
            students[i] = scanner.nextInt();
        }
        int count = 0;
        System.out.println("\nList Point Students:");
        System.out.print("Point = [");
        for (int i = 0; i < students.length; i++) {
            System.out.print("\t" + students[i]);
            if (students[i] >= 5 && students[i] <= 10)
                count++;
        }
        System.out.print("\t]");

        System.out.print("\n The number of students passing the exam is " + count);
        
    }
}
