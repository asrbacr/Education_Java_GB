import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class InClass {
    public static void main(String[] args) {
        /*
         * HashMap<Integer, String> book = new HashMap<>();
         * book.put(3213, "Ivanov");
         * book.put(4345, "Ivanov");
         * book.put(2344, "Ivanov");
         * 
         * HashMap<Integer, String> sortPepople = new HashMap<>();
         * for (var el : book.entrySet()) {
         * String currentValue = el.getValue();
         * if (sortPepople.containsKey(currentValue)) {
         * Integer kol = sortPepople.get(currentValue) + 1;
         * sortPepople.put(currentValue, kol);
         * }
         * else {
         * sortPepople.put(currentValue, 1);
         * }
         * }
         * System.out.println(sortPepople);
         */

        /*
         * 1. Создайте HashSet, заполните его следующими числами: {3, 1, 2, 3, 2, 4, 5,
         * 6, 3}. Распечатайте содержимое данного множества.
         * 2. Создайте LinkedHashSet, заполните его следующими числами: {3, 1, 2, 3, 2,
         * 4, 5, 6, 3}. Распечатайте содержимое данного множества.
         * 3. Создайте TreeSet, заполните его следующими числами: {3, 1, 2, 3, 2, 4, 5,
         * 6, 3}. Распечатайте содержимое данного множества.
         */
        /*
         * Integer[] arr = new Integer[] {3, 1, 2, 3, 2, 4, 5, 6, 3};
         * HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
         * HashSet<Integer> linkSet = new LinkedHashSet<>(Arrays.asList(arr));
         * TreeSet<Integer> treSet = new TreeSet<>(Arrays.asList(arr));
         * 
         * System.out.println(hashSet);
         * System.out.println(linkSet);
         * System.out.println(treSet);
         */

        /*
         * 1. Напишите метод, который заполнит массив из 1000 элементов случайными
         * цифрами от 0 до 24.
         * 2. Создайте метод, в который передайте заполненный выше массив и с помощью
         * Set вычислите процент уникальных значений в данном массиве и верните его в
         * виде числа с плавающей запятой.
         * Для вычисления процента используйте формулу:
         * процент уникальных чисел = количество уникальных чисел * 100 / общее
         * количество чисел в массиве.
         */
        List<Integer> myList = new ArrayList<>();
        randomList(myList);
        // outPrint(myList);
        HashSet<Integer> myHashSet = new HashSet<>(myList);
        // System.out.println(myHashSet);
        
        Double lengthMyList = 1.0 * myHashSet.size() / 10;
        System.out.println(lengthMyList);
    }

    public static void randomList(List<Integer> myList) {

        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            myList.add(i, rand.nextInt(24));
        }
    }
    public static void outPrint(List<Integer> myList) {
        System.out.println(myList);
    }
}
