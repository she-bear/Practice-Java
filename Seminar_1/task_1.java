// Написать программу, которая запросит пользователя ввести имя в консоли
// Получить введенную строку и вывести в консоль сообщение "Привет, <имя>!"
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.printf("Введите Ваше имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    };
}