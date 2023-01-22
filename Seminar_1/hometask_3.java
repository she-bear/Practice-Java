
/*
 * Реализовать простой калькулятор (операции + - / * )
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class hometask_3 {

    static float sum_float(float a, float b) {
        return a + b;
    }

    static float sub_float(float a, float b) {
        return a - b;
    }

    static float mult_float(float a, float b) {
        return a * b;
    }

    static float div_float(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) throws java.io.IOException {
        Scanner iScanner = new Scanner(System.in);

        float num_1 = 0;
        float num_2 = 0;

        try {
            System.out.printf("Введите число 1 (целое или float): ");
            num_1 = iScanner.nextFloat();
            System.out.printf("Введите число 2 (целое или float): ");
            num_2 = iScanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, неверный ввод исходного значения!");
            iScanner.close();
            System.exit(1);
        }

        System.out.printf("Введите арифметическую операцию: ");
        char math_operation = (char) System.in.read();
        iScanner.close();

        float math_result = 0;

        switch (math_operation) {
            case '+':
                math_result = sum_float(num_1, num_2);
                break;
            case '-':
                math_result = sub_float(num_1, num_2);
                break;
            case '*':
                math_result = mult_float(num_1, num_2);
                break;
            case '/':
                math_result = div_float(num_1, num_2);
                break;

            default:
                System.out.println("Ошибка, неверный код операции!");
                System.exit(1);
        }

        System.out.printf("Результат вычисления: %.2f", math_result);
    }
}
