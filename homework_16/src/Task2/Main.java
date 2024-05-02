package Task2;
//Task 2
//
//Запишите в 4 переменные случайные числа от 0 до 100
//Выведите все 4 на экран
//Программа должна определить максимальное из этих четырех чисел
//Результат вывести на экран

public class Main {
    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 54;
        int n3 = 35;
        int n4 = 78;

        System.out.println(n1 + " , " +n2 + " , " +n3 + " , " + n4);

        int max = n1;
        if (n2 > max) {
            max = n2;
        }

        if (n3 > max) {
            max = n3;
        }

        if (n4 > max) {
            max = n4;
        }

        System.out.println("maximum is " + max);
    }
}
