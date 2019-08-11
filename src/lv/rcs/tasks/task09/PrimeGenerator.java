package lv.rcs.tasks.task09;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeGenerator {

    public static void run() {

        System.out.println("---Task 9---");
        int numOfPrimes = scNumber();

        int[] primes = generatePrimes(numOfPrimes);
        displayPrimes(primes);
    }


    private static int scNumber() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number from 0 to 100: ");
            int nrPrime = sc.nextInt();
            while (nrPrime < 0 || nrPrime > 100) {
                System.out.print("Enter number from 0 to 100: ");
                nrPrime = sc.nextInt();
            }
            return nrPrime;
        }
    }


    public static int[] generatePrimes(int nrPrime) {
        int[] arrPrime = new int[nrPrime];
        int prevPrime = 1;
        for (int i = 0; i <= arrPrime.length - 1; i++) {
            for (int j = prevPrime; ; ) {
                j++;
                if (checkPrime(j)) {
                    arrPrime[i] = j;
                    prevPrime = j;
                    break;
                }

            }
        }
        return arrPrime;
    }

    private static boolean checkPrime(int numberToCheck) {
        for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void displayPrimes(int[] primes) {
        System.out.println("Prime numbers: " + Arrays.toString(primes));
    }
}

