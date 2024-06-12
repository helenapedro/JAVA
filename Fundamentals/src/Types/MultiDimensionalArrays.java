package Types;
import java.util.Arrays;

public class MultiDimensionalArrays {
     public static void main(String[] args) {
          int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
          /*
           * int[][][] numbers = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 10, 11,
           * 12 } } };
           */
          System.out.println(Arrays.deepToString(numbers));
     }
}
