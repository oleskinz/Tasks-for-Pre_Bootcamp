package lv.rcs.tasks.task07;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int guessNum = scNumber(sc);
            sc.close();

            Random rnd = new Random();
            int RandomInt = rnd.nextInt(10);

            if(RandomInt == guessNum){
                System.out.println(RandomInt + " = " + guessNum);
                System.out.println("You did it!");
            } else{
                System.out.println(RandomInt + " != " + guessNum);
                System.out.println("Sorry. Try again!");
            }

        }

        public static int scNumber(Scanner sc) {
            System.out.print("Enter the guess number 1 to 10: ");
            return sc.nextInt();
        }
}
