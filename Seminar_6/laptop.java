package Seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class laptop {
    int id;
    String brand;
    String model;
    int ram;
    int ssd;
    String color;
    String osystem;
    int price;

    public laptop(int id, String brand, String model, int ram, int ssd, String color, String osystem, int price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.ssd = ssd;
        this.color = color;
        this.osystem = osystem;
        this.price = price;
    }

    public String toString() {
        return String.format("Ноутбук %s %s, RAM: %d Гб, SSD: %d Гб, цвет: %s, операционная система: %s, цена: %d руб.", 
                            brand, model, ram, ssd, color, osystem, price);
    }

    public static List<laptop> findBrand(HashSet<laptop> laptopSet, String brand) {
        List<laptop> resulList = new ArrayList<laptop>();

        for (laptop item : laptopSet) {
            if (item.brand.equals(brand)) {
                resulList.add(item);
            }
        }
        return resulList;
    }

    public static List<laptop> findRAM(HashSet<laptop> laptopSet, int ram) {
        List<laptop> resulList = new ArrayList<laptop>();

        for (laptop item : laptopSet) {
            if (item.ram == ram) {
                resulList.add(item);
            }
        }
        return resulList;
    }

    public static List<laptop> findSSD(HashSet<laptop> laptopSet, int ssd) {
        List<laptop> resulList = new ArrayList<laptop>();

        for (laptop item : laptopSet) {
            if (item.ssd == ssd) {
                resulList.add(item);
            }
        }
        return resulList;
    }

    public static List<laptop> findColor(HashSet<laptop> laptopSet, String color) {
        List<laptop> resulList = new ArrayList<laptop>();

        for (laptop item : laptopSet) {
            if (item.color.equals(color)) {
                resulList.add(item);
            }
        }
        return resulList;
    }
    
}
