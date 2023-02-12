package Seminar_6;

public class laptop {
    int id;
    String brand;
    String model;
    int ram;
    int ssd;
    String color;
    String osystem;
    int price;

    public laptop(int id, String brand) {
        this.id = id;
        this.brand = brand;
        
    }

    public String toString() {
        return String.format("Бренд: %s, возраст: %s, цвет: %s", brand);
    }
    
}
