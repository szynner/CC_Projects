/**
 * This program defines a simple Calculator class that performs basic arithmetic operations
 * such as addition, subtraction, multiplication, division, and modulo.
 * It demonstrates the usage of these operations in the main method.
 */

public class Calculator {

  public Calculator() {

  }

  // Methods for performing arithmetic operations
  public int add(int a, int b) {
     return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }

  public int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();

    // Perform arithmetic operations and print the results
    int addition = myCalculator.add(5, 7);
    System.out.println("5 + 7 = " + addition);

    int subtraction = myCalculator.subtract(45, 11);
    System.out.println("45 - 11 = " + subtraction);

    int multiplication = myCalculator.multiply(5, 12);
    System.out.println("5 * 12 = " + multiplication);

    int division = myCalculator.divide(10, 2);
    System.out.println("10 / 2 = " + division);

    int modulo = myCalculator.modulo(9, 2);
    System.out.println("9 % 2 = " + modulo);
  }
}

/*
Output:
5 + 7 = 12
45 - 11 = 34
5 * 12 = 60
10 / 2 = 5
9 % 2 = 1
*/