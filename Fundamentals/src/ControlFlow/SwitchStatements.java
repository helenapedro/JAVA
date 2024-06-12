package ControlFlow;

public class SwitchStatements {
     public static void main(String[] args) {
          String role = "admin";

          switch (role) {
               case "admin":
                    System.out.println("You are an admin");
                    break;

               case "moderator":
                    System.out.println("You are a moderator");
                    break;

               default:
                    System.out.println("You are a guest");
          }
     }
}

/*
 * We use Switch Statements to execute differents parts of code,
 * depending on the value of an expression.
 */