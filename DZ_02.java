import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.management.Query;

public class DZ_02 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Задание 1
        /*
         * StringBuilder request = new StringBuilder("select * from students where\n");
         * String reply =
         * "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}"
         * ;
         * System.out.println(ResultSQL(request, reply));
         */
        // Задание 2
        int[] array = { 77, 46, 11, 89, 48, 14, 67, 73, 22, 26 };
        BubbleGrading(array);

        // Задание 4 (калькулятор) я вынес в отдельный файл.
        sc.close();
    }

    public static StringBuilder ResultSQL(StringBuilder request, String reply) {
        /*
         * 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть
         * WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
         * ниже в виде json-строки.
         * Если значение null, то параметр не должен попадать в запрос.
         * Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
         * "city":"Moscow", "age":"null"}
         */

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
        return request;
    }

    public static void BubbleGrading(int[] array) throws IOException {
        try (FileWriter fw = new FileWriter("Result Sort.log", false)) {
            Boolean flag = true;
            while (flag == true) {
                flag = false;
                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        fw.write(String.valueOf(Arrays.toString(array)) + "\n");
                        // fw.flush();
                        flag = true;
                    }
                }
            }
        }
    }

}
