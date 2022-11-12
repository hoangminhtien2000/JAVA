package KeThua.ClassCircle_ClassCylinder;

public class Cylinder extends Circle {
    private double height=3.0;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    public double getvolume(){
        return this.height*super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +"height=" + height +", which is a subclass of "+super.toString()+" The tich "+ getvolume()+      '}';
    }
}
