import java.util.Scanner;

public class FoundIndex {
    public static void main(String[] args) {
        String[] student = {"TIEN", "PHUONG", "LINH", "NGAT", "CUONG"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name's student: ");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(inputName)) {
                System.out.printf("Position of %s in list  is %d", inputName, i);
                isExist = true;
                break;
            }
        }
        if (isExist== false) System.out.printf("Position of %s in list is not Exist", inputName);

    }


}
