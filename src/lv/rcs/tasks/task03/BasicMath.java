package lv.rcs.tasks.task03;

import java.util.Scanner;

import static java.lang.Float.sum;

public class BasicMath {

    public static void main(String[] args) {


        System.out.print("Enter First Number:");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();


        System.out.print("Enter Second Number:");
        Float B = scan.nextFloat();

        scan.close();

        Float result = sum(A, B);
        System.out.println("The sum  " + A + " and " + B + " = " + result);

        Float resultSecond = A - B;
        System.out.println("The Subtracting " + A + " and " + B + " = " + resultSecond);

        Float resultThird = A * B;
        System.out.println("The Multiplying " + A + " and " + B + " = " + resultThird);

        Float resultFour = A/B;
        System.out.println("The Result of dividing is " + A + " and " + B + " = " + resultFour);

        double resultSqrt = Math.sqrt( A + B );
        System.out.println("The sum  " + A + " and " + B + " = " + resultSqrt);
    }

}
