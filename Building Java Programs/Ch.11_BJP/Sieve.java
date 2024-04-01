// Example provided in chapter 11.
// Uses a linked list to implement the sieve of Eratosthenes algorithm
// for finding prime numbers.

import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum.");
        System.out.println();

        Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();

        List<Integer> primes = sieve(max);
        System.out.println("Prime numbers go up to " + max + ":");
        System.out.println(primes);
        
        console.close();
    }

    // Returns a list of all prime numbers up to given max
    // using the sieve of Eratosthenes algorithm.
    public static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<>();

        // add all numbers from 2 to max to a list
        List<Integer> numbers = new LinkedList<>();
        for (int i = 3; i <= max; i++) {
            if (i % 2 != 0) {
                numbers.add(i);
            }
        }

        primes.add(2);

        while (!numbers.isEmpty()) {
            // remove a prime number from the front of the list
            int front = numbers.remove(0);
            primes.add(front);

            // remove all multiples of this prime number
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) {
                    itr.remove();
                }

                if (front > Math.sqrt(max)) {
                    break;
                }
            }
        }

        while (!numbers.isEmpty()) {
            primes.add(numbers.remove(max));
        }

        return primes;
    }
}
