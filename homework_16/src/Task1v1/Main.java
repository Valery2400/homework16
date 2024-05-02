package Task1v1;

import java.util.Scanner;

public class Main {
//Task 1
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
// а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1-3: ");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("You entered 1");
        } else {
            if (number == 2) {
                System.out.println("You entered 2");
            } else {
                if (number == 3) {
                    System.out.println("You entered 3");
                } else {
                    System.out.println("Please enter correct number 1-3");
                }

            }
        }

    }
}

