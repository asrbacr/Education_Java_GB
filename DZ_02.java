import java.util.Arrays;

import javax.management.Query;

public class DZ_02 {
    public static void main(String[] args) {
        StringBuilder request = new StringBuilder("select * from students where ");
        String reply = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] formatQuery = reply.replace('{', '\0')
                                .replace('}', '\0')
                                .replace('"', '\0')
                                .replace(' ', '\0')
                                .split(",");
        // System.out.println(Arrays.toString(formatQuery));

        for (String string : formatQuery) {
            String[] splitString = string.split(":");
            if (!splitString[1].contains("null")) {
                request.append(splitString[0] + " = " + splitString[1] + " AND ");
            }
        }
        System.out.println(request);

    }

    // public static String[]  (String[] args) {
        
    // }
}
