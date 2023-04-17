import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//https://metanit.com/java/tutorial/7.3.php
//https://metanit.com/java/tutorial/7.1.php

public class InClass {

    // можно iScaner вынести сюда.
    public static Scanner iScanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1 задача
        // Integer N = iScanner.nextInt();
        // System.out.println(SumString(N));

        
        // 2 задача
        /*
         * Напишите метод, который сжимает строку.
         * Пример: вход aaaabbbcddad.
         * Выход abcd
         * charAt(i) и indefOf(s) => не найден -1
         */
        /* String defauld_ = "aaaabbbcddad";
        String res = "";
        for (int i = 0; i < defauld_.length(); i++) {
            char s = defauld_.charAt(i);
            if (res.indexOf(s) == -1) res += s;
            
        }
        System.out.println(res); */


        // 3 задача
        /* Напишите метод, который принимает на вход строку (StringBulder) и определяет является ли строка палиндромом (возвращает boolean значение).
        equals и StringBulder для revers */
        /* StringBuilder name = new StringBuilder(iScanner.nextLine());
        // StringBuilder namePolindrome = name.reverse(); // не допустимо
        StringBuilder namePolindrome = new StringBuilder(name);
        namePolindrome.reverse();
        // System.out.println(name.toString());                 
        // System.out.println(namePolindrome.toString());  
        // System.out.println(name.equals(namePolindrome)); // не верно работает ссылки разные, т.к. тут не строка.     == тоже сравнивает ссылки, а они не равны.
        System.out.println(name.toString().equals(namePolindrome.toString())); */

        // 4 задача
        /* Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения. */
        /* try (FileWriter fw = new FileWriter("1.txt")) {
            for (int i = 0; i < 100; i++) {
                fw.write("TEST");
                fw.append('\n');   
            } 
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } */


        /* Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
        string array.
        Напишите метод, который выведет массив, возвращенный предыдущим методом в файл. 
        stringbilding.
        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться в лог-файл.
        https://metanit.com/java/tutorial/6.11.php
        [ “Sem1”, “Sem2”] */


    }

    public static String SumString(Integer N) {
        /*
         * Дано целое число N (>0) и символы c1 и c2.
         * Написать метод, который вернет строку длины N, которая состоит из
         * чередующихся символов c1 и c2, начиная с c1.
         * N=5
         * c1=”Oleg”
         * c2=”Vasya”
         * res = “OlegVasyaOlegVasyaOleg”
         */

        String c1 = "Oleg";
        String c2 = "Kamila";
        String res = "";
        for (int i = 0; i < N; i++) {
            // if (i % 2 == 0) res+=c1;
            // else res+=c2;

            // тернарный оператор
            res += i % 2 == 0 ? c1 : c2;
        }
        return res;
    }

}
