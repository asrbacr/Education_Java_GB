import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DZ_04 {
    public static void main(String[] args) {

        Integer[] userInput = new Integer[] { 77, 46, 11, 89, 48, 14, 67, 73, 22, 26, 47, 1, 67, 23, 4 };

        // Задача 1. я подумал, что будет правильней принять список и в функции вернуть
        // тоже список.
        /*
         * System.out.println(Arrays.toString(userInput));
         * System.out.println(Arrays.toString(ConvertList(userInput)));
         */

        // Задача 2.
        // LinkedList<Integer> testList = new LinkedList<>(Arrays.asList(userInput));
        // System.out.println(List.copyOf(testList));
        Queue<Integer> stepQueue = new LinkedList();
        for (int i = 0; i < userInput.length; i++) {     // применение метода enqueue
            stepQueue.add(userInput[i]);
        }
        System.out.println(String.valueOf(stepQueue)); 
        System.out.println("dequeue: " + stepQueue.poll() + " <- " + String.valueOf(stepQueue));   // применение метода dequeue
        System.out.println("first: " + stepQueue.peek() + " <- " + String.valueOf(stepQueue));   // применение метода first


        // Задача 3
        // вынесена в отдельный файл Task_Calculator.java

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
