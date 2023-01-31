package Seminar_3;

public class object_demo {
    public static void main(String[] args) {
        // в Object м.б. положен ЛЮБОЙ тип данных
        Object obj = 1.2;
        GetType(obj);
    }

    // вывод типа
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}

    
