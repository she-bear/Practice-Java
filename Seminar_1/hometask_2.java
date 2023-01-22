/*
 * Вывести все простые числа от 1 до 1000
 */
public class hometask_2 {
    public static void main(String[] args) {
        int n = 1000;
        for (int i = 2; i < n; i++) {
            boolean is_prime = true;
            int sqr_limit = (int) Math.sqrt(i);
            for (int j = 2; j <= sqr_limit; j++) {
                if ((i % j) == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                System.out.println(i);
            }
        }
    }
}
