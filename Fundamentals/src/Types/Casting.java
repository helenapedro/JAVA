package Types;
public class Casting {
     public static void main(String[] args) {
          // Implicit casting
          // byte > short > int > long > float > double

          /*
           * double x = 1.1;
           * double y = x + 2;
           */ // implicit casting

          /*
           * double x = 1.1;
           * double y = (int) x + 2; // explicit casting
           * System.out.println(y);
           */

          /*
           * String x = "1";
           * int y = Integer.parseInt(x) + 2; // wrapper classe
           * System.out.println(y);
           */

          String x = "1.1";
          double y = Double.parseDouble(x) + 2; // wrapper classe
          System.out.println(y);
     }
}

// Implicit casting > it happens whenever we're not going to loose data
// Explicit Casting can only happen between compatible types
// pesquisar sobre Rule of Thumb
// wrapper classes