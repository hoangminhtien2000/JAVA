import java.util.Scanner;

public class SudungToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai bao doi tuong Scanner
        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhap chieu rong
        System.out.println("Enter heigth: ");
        height = scanner.nextFloat();//Nhap chieu dai
        float area = width * height;
        System.out.println("Area= " + area);
    }
}

