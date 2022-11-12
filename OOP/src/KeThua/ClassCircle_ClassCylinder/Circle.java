package KeThua.ClassCircle_ClassCylinder;

public class Circle {
    private double radius = 1.0;
    private String color="red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.color=color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*this.radius*Math.PI;
    }


    @Override
    public String toString() {
        return "Circle { " + "radius=" + radius + ", color='" + color + "',\t"+
                "Chu vi "+getPerimeter()+" \tDien tich "+getArea()+" }";
    }
}
