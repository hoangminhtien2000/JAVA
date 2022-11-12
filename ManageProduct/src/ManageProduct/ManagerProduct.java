package ManageProduct;

import java.util.Scanner;

public class ManagerProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static Product[] products = new Product[0];

    static public void show() {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
    }

    public static void addArr(Product product) {
        Product[] newArr = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newArr[i] = products[i];
        }
        newArr[newArr.length - 1] = product;
        products = newArr;
    }

    public static void addProduct() {
        Product product = new Product();
        System.out.println("Nhap san pham can them: ");
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        product.setId(id);
        scanner.nextLine();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        product.setName(name);
        System.out.println("Nhap gia: ");
        double price = scanner.nextDouble();
        product.setPrice(price);
        addArr(product);
    }

    public static int Value(Product[] products, int value) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == value) return i;
        }
        return -1;
    }

    public static void delete() {
        int id1, index;
        do {
            System.out.println("Enter id san pham muon xoa: ");
            id1 = scanner.nextInt();
            index = Value(products, id1);
            if (index == -1) System.out.println("Value is Exist. Please, Enter again.");
        } while (index == -1);
        Product[] arrnew = new Product[products.length - 1];
        for (int i = 0; i < products.length - 1; i++) {
            if (i < index) arrnew[i] = products[i];
            else arrnew[i] = products[i + 1];
        }
        products = arrnew;
    }

    public static void edit() {
        int id1, index;
        do {
            System.out.println("Enter id san pham muon sua: ");
            id1 = scanner.nextInt();
            index = Value(products, id1);
            if (index == -1) System.out.println("Value is Exist. Please, Enter again.");
        } while (index == -1);
        Product product = new Product();
        for (int i = 0; i < products.length; i++) {
            if (i == index) {
                products[i] = product;
                System.out.println("San pham muon sua");
                System.out.println("Nhap id moi: ");
                int id = scanner.nextInt();
                product.setId(id);
                System.out.println("Nhap ten moi: ");
                String name = scanner.nextLine();
                name = scanner.nextLine();
                product.setName(name);
                System.out.println("Nhap gia moi: ");
                double price = scanner.nextDouble();
                product.setPrice(price);
            }
        }
    }
}