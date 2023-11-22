package sololearn;

import  java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);

        int choice;

        // Check if the input is an interger
        if (sc.hasNextInt()) {
            choice = sc.nextInt();

            // Check if the choice is within the valid range
            if (choice >= 0 && choice < menu.length) {
                String selectedDrink = menu[choice];
                System.out.println(selectedDrink);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("invalid input. Pleasenenter a valid integer");
        }

        sc.close();
    }
}
