package Class_Object;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;


    private QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String display() {
        return this.a + "x^2 + " + this.b + "x +  "+c+ " = 0";
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b,2) - 4*this.a * this.c;
        return delta;
    }

    public double getRoot() {
        return -this.b/(2*this.a);
    }

    public double getRoot1() {
        return (-this.b+Math.sqrt(getDiscriminant())/(2*this.a));
    }
    public double getRoot2() {
        return (-this.b-Math.sqrt(getDiscriminant())/(2*this.a));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a,b,c;
        do{
            System.out.println("Enter a");
            a=scanner.nextDouble();
            System.out.println("Enter b");
            b=scanner.nextDouble();
            System.out.println("Enter c");
            c=scanner.nextDouble();
            if(a==0) System.out.println("Enter again");
        }while (a==0);
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
        System.out.println("Delta=" +quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("R1=" + quadraticEquation.getRoot1());
            System.out.println("R2=" + quadraticEquation.getRoot2());
        }
        if (quadraticEquation.getDiscriminant()==0){
            System.out.println("R=" + quadraticEquation.getRoot());
        }
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }

    }
}
