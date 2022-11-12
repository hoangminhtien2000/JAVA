package AccessModifier_StaticMethod_StaticProperty.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1=new Circle();
        circle1.setRadius(2.0);
        System.out.println("R1 = "+circle1.getRadius());
        System.out.println("Area1 = "+circle1.getArea());
    }

}
