package Seminar_2;
// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

public class task_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcddw";
        int count = 1;
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                newStr.append(str.charAt(i));
                newStr.append(count);
                count = 1;
            }
        }
        newStr.append(str.charAt(str.length() - 1));
        newStr.append(count);

        System.out.println(newStr);
    }
}
