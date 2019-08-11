package lv.rcs.tasks.task04;

import java.util.Scanner;

public class ConditionalMath {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println( " Enter a whole number a" );
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println( " Enter a whole number b" );
        int b = scan.nextInt();

        sc.close();
        if (a >b) {
            System.out.println(a + " is greater than " + b);

        } else {
            if (b >a) {
                System.out.println(b + " is greater than " + a);
            } else {
                if (a == b) {
                    System.out.println(a + " and " + b + " are equal");
                }
            }

            }
        }
    }

