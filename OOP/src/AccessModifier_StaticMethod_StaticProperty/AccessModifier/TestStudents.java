package AccessModifier_StaticMethod_StaticProperty.AccessModifier;

public class TestStudents {
    public static void main(String[] args) {
        Students students1=new Students();
        students1.setName("Tien");
        students1.setClasses("CO3");
        System.out.println(students1.getClasses());
    }
}
