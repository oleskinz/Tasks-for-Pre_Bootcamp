package lv.rcs.tasks.task05;

import java.util.Scanner;

public class Task05 {
    public static void run() {
        System.out.println("---Task 5---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstname and lastname");
        String yourInput = scanner.nextLine();

        System.out.println(yourInput);

        String[] arrSplit = yourInput.split(" ");
        String firstName = arrSplit[0];
        String lastName = arrSplit[1];

        // System.out.println(firstName);
        //System.out.println(lastName);

        String formattedName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String formattedLastName = lastName.toUpperCase();
        //System.out.println(formattedName);
        //System.out.println(formattedLastName);

        System.out.println(yourInput + " --> " + formattedName + " " + formattedLastName);

    }
}




