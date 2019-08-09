package jtm.activity01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrimeGenerator {

        public static void run () {

            int numOfPrimes = scNumber();

            List<Integer> primes= generatePrimes(numOfPrimes);
            displayPrimes(primes);

            System.out.print("A teperj babskij variant ");

            int[] primesBabskij= babskijVariant(numOfPrimes);
            displayPrimesBabskij(primesBabskij);
        }

        public static List<Integer> generatePrimes(int num) {
            List<Integer> primes = new ArrayList<>();
            for (int i = 2;; i++) {
                if(primes.size() >= num){
                    break;
                }
                if (CheckPrime(i) ) {
                    primes.add(i);
                }
            }
            return primes;
        }

        private static int scNumber() {
            try(Scanner sc = new Scanner(System.in)){
                System.out.print("Enter number from 0 to 100: ");
                int nrPrime = sc.nextInt();
                while (nrPrime < 0 || nrPrime > 100) {
                    System.out.print("Enter number from 0 to 100: ");
                    nrPrime = sc.nextInt();
                }
                return nrPrime;
            }
        }

        private static boolean CheckPrime(int numberToCheck) {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    return false;
                }
            }
            return true;
        }

    private static void displayPrimes(List<Integer> primes){
        System.out.println("Prime numbers: " + Arrays.toString(primes.toArray()));
    }

    private static int[] babskijVariant(int nrPrime){
        int[] arrPrime = new int[nrPrime];
        int prevPrime = 1;
        for (int i = 0; i <= arrPrime.length-1; i++) {
                for (int j=prevPrime;; ) {
                    j++;
                    if(CheckPrime(j)){
                        arrPrime[i] = j;
                        prevPrime=j;
                        break;
                    }

                }
        }
        return arrPrime;
    }

    private static void displayPrimesBabskij(int[] primes){
        System.out.println("Prime numbers: " + Arrays.toString(primes));
    }
}