
import java.util.Scanner;

public class DocSoThanhChu {
    public static String Goiso(int i) {
        String ones = new String();

        switch (i) {
            case 0:
                ones = "khong";
                break;
            case 1:
                ones = "mot";
                break;
            case 2:
                ones = "hai";
                break;
            case 3:
                ones = "ba";
                break;
            case 4:
                ones = "bon";
                break;
            case 5:
                ones = "nam";
                break;
            case 6:
                ones = "sau";
                break;
            case 7:
                ones = "bay";
                break;
            case 8:
                ones = "tam";
                break;
            case 9:
                ones = "chin";
                break;
        }
        return ones;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("so nhap vao");
        int number = scanner.nextInt();
        System.out.println(Goiso(number/100)+"tram");
        int j = number - ((number/100)*100);
        System.out.println(Goiso(j/10)+"chuc");
        int k = j-((j/10)*10);
        System.out.println(Goiso(k)+"donvi");
    }

}