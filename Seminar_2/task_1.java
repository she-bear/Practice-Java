package Seminar_2;
// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST

public class task_1 {
    public static void main(String[] args) {
         var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("TEST");
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s);        
    }
}
