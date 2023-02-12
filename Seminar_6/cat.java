package Seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class cat {
    String name;
    int age;
    String color;
    String breed;
    String gender;
    Boolean purring;
    int id;

    // @Override
    public String toString() {
        return String.format("ID: %d, кличка: %s, возраст: %s, цвет: %s", id, name, age, color);
    }

    public cat(String name, int age, String color, String breed, String gender, Boolean purring, int id){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.purring = purring;
        this.id = id;
    }

    public void findCat(HashSet<cat> hashCat, String gender) {
        for (cat cat: hashCat) {
            if(cat.gender == gender) {
                System.out.println(cat);
            }
        }
    }

    public static List<cat> findCat_L(HashSet<cat> hashCat, String gender) {
        List<cat> catList = new ArrayList<cat>();
        for (cat cat: hashCat) {
            if (cat.gender.equals(gender)) {
                catList.add(cat);
            }
        }
        return catList;
    }
}
