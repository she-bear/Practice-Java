// 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. 
// Создайте несколько экземпляров этого класса, выведите их в консоль.
// 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
package Seminar_6;

import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        HashSet<cat> catSet = new HashSet<cat>();
        
        cat cat_1 = new cat("Барсик", 5, "рыжий", "сибиряк", "male", true, 1);
        cat cat_2 = new cat("Маркиза", 2, "белый", "дворовая", "female", true, 2);
        cat cat_3 = new cat("Березка", 6, "трехцветный", "дворовая", "female", true, 3);

        catSet.add(cat_1);
        catSet.add(cat_2);
        catSet.add(cat_3);

        System.out.println("Добро пожаловать в систему котов!");
        System.out.println("Меню: \n Нажмите 1, чтобы вывести породы всех котов; \n Нажмите 2 для поиска;");

        Scanner iScanner = new Scanner(System.in);
        int userInput = iScanner.nextInt();
        switch (userInput) {
            case 1:
                for (cat item: catSet) {
                    System.out.println(item.breed);
                }
                break;
            case 2:
                System.out.println("Введите пол кота для поиска (male/female): ");
                String userInputGender = iScanner.next();
                System.out.println(cat.findCat_L(catSet, userInputGender));
                break;
        }
    }
}
