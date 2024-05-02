package Task1v2;
//Перепишите решение задачи с использованием switch вместо if-else

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1-3: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
            System.out.println("You entered 1");
            break;
            case 2:
            System.out.println("You entered 2");
            break;
            case 3:
            System.out.println("You entered 3");
            break;
            default:
            System.out.println("Please enter correct number 1-3");
        }

    }
}



