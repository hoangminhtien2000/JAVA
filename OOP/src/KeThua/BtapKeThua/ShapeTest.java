package KeThua.BtapKeThua;

public class ShapeTest {
    public static void main(String[] args) {
       Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);
        Circle circle = new Circle("blue",true,2.0);
        System.out.println(circle);
        Rectangle rectangle=new Rectangle("green",false,2.0,3.0);
        System.out.println(rectangle);
        Square square=new Square("black",false,2.0);
        System.out.println(square);
    }
}