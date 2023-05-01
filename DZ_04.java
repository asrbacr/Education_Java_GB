import java.util.Arrays;
import java.util.LinkedList;

public class DZ_04 {
    public static void main(String[] args) {
        // Задача 1. я подумал, что будет правильней принять список и в функции вернуть тоже список.
        Integer[] userInput = new Integer[] { 77, 46, 11, 89, 48, 14, 67, 73, 22, 26, 47, 1, 67, 23, 4 };
        System.out.println(Arrays.toString(userInput));
        System.out.println(Arrays.toString(ConvertList(userInput)));
    }

    private static Integer[] ConvertList(Integer[] userInput) {
        LinkedList<Integer> listOne = new LinkedList<>(Arrays.asList(userInput));
        LinkedList<Integer> resulList = new LinkedList<>();
        int size = listOne.size();
        for (int i = 0; i < size; i++) 
            resulList.addFirst(listOne.removeFirst());
        Integer[] result = resulList.toArray(new Integer[resulList.size()]);
        return result;
    }
}
