import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        int tienGui, thangGui;
        double tiLeLaiSuat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Tien Gui: ");
        tienGui = scanner.nextInt();
        System.out.println("Enter Ti le lai suat: ");
        tiLeLaiSuat = scanner.nextDouble();
        System.out.println("Enter So thang gui: ");
        thangGui = scanner.nextInt();
        double tienLai = tienGui * tiLeLaiSuat / 12 * thangGui;
        System.out.printf("Tien lai la: %.2f",tienLai);
    }
}
