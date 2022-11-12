package KeThua.ClassPoint2D_ClassPoint3D;

import java.util.Arrays;

public class RunTest {
    public static void main(String[] args) {
        Point2D point2D=new Point2D(1.0f,2.0f);
        System.out.println(point2D);
        System.out.println("Point2D "+Arrays.toString(point2D.getXY()));
        Point3D point3D=new Point3D(1.0f,2.0f,3.0f);
        System.out.println(point3D);
        System.out.println("Point3D "+Arrays.toString(point3D.getXYZ()));
    }
}
