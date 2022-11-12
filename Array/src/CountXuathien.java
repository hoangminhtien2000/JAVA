import java.util.Scanner;

public class CountXuathien {
    public static void main(String[] args) {
        String chuoi = "asdkglassdaldksdasdasacas";
        int count = 0;
        char kyTu = 'a';
        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (kyTu == chuoi.charAt(i)) {
                count++;
            }
        }
        System.out.println("\nSo lan '" + kyTu + "' xuat hien trong chuoi '" + chuoi + "' = " + count);
    }
}





