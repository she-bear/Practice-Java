package Seminar_2;
public class task_3 {
    public static void main(String[] args) {
        String strDirty = "{\"name\":\"site_3\", \"version\":\"1.0.0\", \"description\":\"text\",\"main\":\"index.js\"}";
        String str = strDirty.replace("{", "").replace("}", "").replace("\"", "");
        StringBuilder string = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();
        String [] newStr = str.split(",");
        
        for (String string2: newStr) {
            String [] string3 = string2.split(":");
            System.out.printf("%s = %s", string3[0], string3[1]);
            finalStr.append(string);
        }         
    }
}
