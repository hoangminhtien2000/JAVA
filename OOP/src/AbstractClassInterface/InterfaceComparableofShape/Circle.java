package AbstractClassInterface.InterfaceComparableofShape;

public class Circle {
    private double radius=1.0;
    private String color="red";
    private boolean filled=true;

    public Circle() {    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }


}
