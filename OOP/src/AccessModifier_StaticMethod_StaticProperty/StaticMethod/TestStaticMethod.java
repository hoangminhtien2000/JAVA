package AccessModifier_StaticMethod_StaticProperty.StaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        Students.getCollege(); //calling change method

        //creating objects
        Students s1 = new Students(1, "Hoang");
        Students s2 = new Students(2, "Minh");
        Students s3 = new Students(3, "Tien");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
