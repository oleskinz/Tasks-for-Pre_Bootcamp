package lv.rcs.tasks.task01and02;

import java.util.Scanner;

public class GreetingsInteractive {
    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = name.nextLine();

        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age");
        String yourAge = name.nextLine();

        System.out.println("Hello, my name is " + yourName + " I am " + yourAge + " years old");

        name.close();
        age.close();
    }

}
