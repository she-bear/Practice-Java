
/*
 * Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class hometask_1 {

    static int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // через рекурсию
    static float getFactorial_rec(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * getFactorial_rec(num - 1);
        }
    }

    // через цикл
    static float getFactorial(int num) {
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor = factor * i;
        }
        return factor;
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        try {
            System.out.printf("Введите целое положительное число: ");
            int num = iScanner.nextInt();
            System.out.printf("Сумма: %d \n", getSum(num));
            System.out.printf("Факториал (рекурсия): %.0f \n", getFactorial_rec(num));
            System.out.printf("Факториал (цикл): %.0f", getFactorial(num));
            iScanner.close();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, неверный ввод исходного значения!");
        }
    }
}