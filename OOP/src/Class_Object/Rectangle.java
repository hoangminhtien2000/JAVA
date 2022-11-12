package Class_Object;

import java.util.Scanner;

public class Rectangle {
    double width, height;
//Hàm khởi tạo:
    public Rectangle(double weight, double height) {
        this.width = weight;
        this.height = height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public String display(){
        return "Rectangle { "+"Width "+width+", Height "+height+" }";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter width: ");
        double width=scanner.nextDouble();
        System.out.println("Enter height: ");
        double height=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println("Your Rectangle:\n"+rectangle.display());
        System.out.println("Perimeter: "+rectangle.getPerimeter());
        System.out.println("Area: "+rectangle.getArea());
    }

}
