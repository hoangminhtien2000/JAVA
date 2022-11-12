package KeThua.Triangle;

public class Triangle {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle() {}
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPermeter(){
      return this.side1+this.side2+this.side3;
    }
    public double getArea(){
        double a=getPermeter()/2;
        return Math.sqrt(a*(a-this.side1)*(a-this.side2)*(a-this.side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}'+ " Chu vi "+getPermeter() + " Dien tich "+getArea();
    }
}
