// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Вход: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Выход: select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
// Если значение null, то параметр не должен попадать в запрос.

package Seminar_2;

public class hometask_1 {
    public static void main(String[] args) {
        String queryString = "select * from students where ";
        String jsonString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        StringBuilder queryBuilder = new StringBuilder(queryString);

        // уберём лишние символы
        jsonString = jsonString.replace("\"", "").replace("{", "").replace("}", "");
        // получим массив строк ключ:значение
        String [] valuesString = jsonString.split(","); 
        // зададим разделитель
        String loopDelim = "";

        for (String item:valuesString) {
            // убрали пробелы в начале пар ключ:значение
            item = item.trim();
            // разделим каждую пару
            String [] keysString = item.split(":");

            // исключаем null
            if (!"null".equalsIgnoreCase(keysString[1])) {
                queryBuilder.append(loopDelim);
                queryBuilder.append(keysString[0]).append(" = \"").append(keysString[1]).append("\"");

                loopDelim = " and ";
            }
        }

        System.out.println(queryBuilder);
    }
}