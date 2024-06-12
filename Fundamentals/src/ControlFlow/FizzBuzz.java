package ControlFlow;
import java.util.Scanner;

public class FizzBuzz {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Number: ");
          int number = scanner.nextInt();

          if (number % 5 == 0 && number % 3 == 0)
               System.out.println("FizzBuss");
          else if (number % 5 == 0)
               System.out.println("Fizz");
          else if (number % 3 == 0)
               System.out.println("Buzz");
          else
               System.out.println(number);
     }
}

/*
 * Um número natural é dito ser divisível por um outro número natural,
 * diferente de zero, quando a divisão entre eles for exata, isto é,
 * quando o resto for igual a zero.
 */
