package ControlFlow;

import java.util.Scanner;

public class whileLoops {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String input = "";
          while (!input.equals("quit")) {
               System.out.print("Input: ");
               input = scanner.next().toLowerCase();
               System.out.println(input);
          }
     }
}

/*
 * We use While Loops in situations where we don't know ahead of time,
 * how many times we want to repeat something.
 */