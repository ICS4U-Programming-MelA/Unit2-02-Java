// Import modules.
import java.lang.NumberFormatException;
import java.util.Scanner;

/** Copyright (c) 2022 Mel Aguoth All rights reserved.
 * This program calculates a factorial using recursion.
 *
 * @author  Mel Aguoth
 * @version 11.0.13
 * @since 2022-01-18
 */

class RecursiveFactorial {
  public static int factorial(int calcInt) {

    // If the user's number is equal to 1, return 1.
    if (calcInt == 1) {
      return 1;

    // If the user's number is anything else, recurse it.
    } else {
      return calcInt * factorial(calcInt - 1);
    }
  }

  public static void main(String[] args) {

    // Declare variables.
    String userString = "";

    try {
      // Introduce the program.
      System.out.print("This program calculates and displays the factorial of a given"
                     + " integer using recursion.");
 
      // Get the user's integer.
      Scanner input = new Scanner(System.in);
      System.out.print("\n" + "Enter an integer: ");
      userString = input.next();
      int userInt = Integer.parseInt(userString);
      input.close();

      // If the user's integer isn't above 0, display an error to the user.
      if (userInt < 1) {
        System.out.print("\n" + userInt + " isn't above 0. Please enter an integer above 0."
                       + "\n");
      } else {

        // Call factorial.
        final int answer = factorial(userInt);

        // Display the factorial
        System.out.print("\n" + userInt + "! is: " + answer + "\n");
      }

    // If the user's input isn't an integer, display an error to the user.
    } catch (NumberFormatException e1) {
      System.out.print("\n" + "'" + userString + "' isn't an integer."
                     + " Please enter a proper integer." + "\n");
    }
  }
}
