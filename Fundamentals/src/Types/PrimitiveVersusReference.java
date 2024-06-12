package Types;
import java.awt.*;

public class PrimitiveVersusReference {
     public static void main(String[] args) {
          Point point1 = new Point(1, 1);
          Point point2 = point1;
          point1.x = 2;
          System.out.println(point2);
     }
}

/*
 * Reference types don't store the actual values, they store
 * a reference to ano object, somewhere in the memory.
 */