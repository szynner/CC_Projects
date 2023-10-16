/**
 * The PrimeDirective class contains methods for checking if there are prime numbers.
*/

import java.util.ArrayList;

public class PrimeDirective {

    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {7, 28, 2, 0};

        ArrayList<Integer> primeNumbers = pd.onlyPrimes(numbers);
        System.out.println("Prime numbers in the array: " + primeNumbers);
    }
}

// Output: Prime numbers in the array: [7, 2]