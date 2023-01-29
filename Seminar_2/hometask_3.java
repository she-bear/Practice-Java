package Seminar_2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.*;

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

        
        // создаем Logger
        Logger logger = Logger.getLogger(hometask_3.class.getName());
        // отключение вывода в консоль
        logger.setUseParentHandlers(false);

        // связываем logger и файл
        // будем дописывать в конец append:true
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        try {
            System.out.printf("Введите число 1 (целое или float): ");
            num_1 = iScanner.nextFloat();
            logger.info("Ввод первого аргумента: " + num_1);
            System.out.printf("Введите число 2 (целое или float): ");
            num_2 = iScanner.nextFloat();
            logger.info("Ввод второго аргумента: " + num_2);
        } catch (InputMismatchException ex) {
            System.out.println("Ошибка, неверный ввод исходного значения!");
            logger.log(Level.WARNING , "Ошибка, неверный ввод исходного значения!");
            iScanner.close();
            System.exit(1);
        }

        System.out.printf("Введите арифметическую операцию: ");
        char math_operation = (char) System.in.read();
        logger.info("Ввод арифметической операции: " + math_operation);
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
                logger.log(Level.WARNING , "Ошибка, неверный код операции!");
                System.exit(1);
        }

        System.out.printf("Результат вычисления: %.2f", math_result);
        logger.info("Результат: " + math_result);
    }
    
}
