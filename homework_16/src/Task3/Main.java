package Task3;
//Программа просит пользователя ввести число от 1 до 7
// Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
// Если 6 или 7 – “Выходной”.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ведите число,соответсвующее дню недели (1-7) ");
        System.out.println("для выхода введите 0 : ");
        int numberDay=1;
        while(numberDay>0) {

            numberDay = scanner.nextInt ();

            switch (numberDay) {
                case 0:
                    break;
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник. Сегодня консультация в 15.30");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Черверг. Сегодня консультация в 15.30");
                    break;
                case 5:
                    System.out.println("Слава Богу Пятница");
                    break;
                case 6,7:
                    System.out.println("Выходной");
                    break;
                default:
                    System.out.println("Вы серьезно? Только 7 дней в неделе. ");
            }
        }
        scanner.close();
    }
}
