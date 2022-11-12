package KeThua.Point_MoveablePoint;

public class RunTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(1.0f,2.0f,3.0f,4.0f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
