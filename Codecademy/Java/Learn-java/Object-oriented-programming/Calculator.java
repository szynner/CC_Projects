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
    System.out.println(addition);

    int subtraction = myCalculator.subtract(45, 11);
    System.out.println(subtraction);

    int multiplication = myCalculator.multiply(5, 12);
    System.out.println(multiplication);

    int division = myCalculator.divide(10, 2);
    System.out.println(division);

    int modulo = myCalculator.modulo(9, 2);
    System.out.println(modulo);
  }
}

/*
Output:
12
34
60
5
1
*/