/**
 * This class CarLoan calculates the monthly payment for a car loan based on the loan amount, loan length, interest rate, and down payment. 
 */
public class CarLoan {
    // Main method
    public static void main(String[] args) {
    
    // Defining variables for the car loan, loan length, interest rate, and down payment.
    int carLoan = 10000;      
    int loanLength = 3;       
    int interestRate = 5;     
    int downPayment = 2000;   

    // Check for valid loan conditions and calculate the monthly payment.
    if (loanLength <= 0 || interestRate <= 0) {
        System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
        System.out.print("The car can be paid in full.");
    } else {
        // Calculate the remaining balance, total months, monthly balance, interest, and monthly payment.
        int remainingBalance = carLoan - downPayment;
        int months = loanLength * 12;
        int monthlyBalance = remainingBalance / months;
        int interest = (monthlyBalance * interestRate) / 100;
        int monthlyPayment = monthlyBalance + interest;

        // Display the calculated monthly payment.
        System.out.println(monthlyPayment);
    }
  }
}

// Output: 233