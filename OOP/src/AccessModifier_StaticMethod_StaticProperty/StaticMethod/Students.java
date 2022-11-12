package AccessModifier_StaticMethod_StaticProperty.StaticMethod;

public class Students {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public static void getCollege() {
         college="CODEGYM";
    }
    public void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}


