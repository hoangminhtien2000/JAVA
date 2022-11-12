package AbstractClassInterface.ComparatorSoSanh;

import java.util.Arrays;

public class RunTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle(3.5, "blue", false);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle:circles             ) {
            System.out.println(circle);
        }

    }
}
